package com.itheima.demo10.WaitAndNotify;

/**
 * @Description：进入到TimeWaiting(计时等待)有两种方式
 * @Author 金宇佳
 * @Date 2020/11/24 8:57
 * @Version 1.0
 */

/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
        void notify() 唤醒在此对象监视器上等待的单个线程.
        void notifyAll()唤醒在此对象监视器上等待的所有线程.
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object o = new Object();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了,顾客1开吃!");
                        System.out.println("--------------------------");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        try {
                            // o.wait(5000);
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了,顾客2开吃!");
                        System.out.println("--------------------------");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o) {
                        System.out.println("老板5秒钟之后做好包子,告知客户,可以吃包子了");
                        // o.notify();
                        o.notifyAll();
                    }
                }
            }
        }.start();
    }
}
