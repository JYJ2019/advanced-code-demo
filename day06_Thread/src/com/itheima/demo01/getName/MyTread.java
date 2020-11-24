package com.itheima.demo01.getName;

/**
 * @Description：获取线程的名称
 * @Author 金宇佳
 * @Date 2020/11/19 17:25
 * @Version 1.0
 */

/*
    获取线程的名称:
        1.使用Thead类中的方法getName()
            String getName() 返回该线程的名称.
        2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
            static Tread currentTread() 返回对当前正在执行的线程对象的引用.
 */
//    定义一个Tread类的子类
public class MyTread extends Thread {
    //重写Thread类中的run方法,设置线程任务
    @Override
    public void run() {
        //获取线程名称
        // String name = getName();
        // System.out.println(name);

        /*Thread t = Thread.currentThread();
        System.out.println(t);
        String name = t.getName();
        System.out.println(name);*/

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
