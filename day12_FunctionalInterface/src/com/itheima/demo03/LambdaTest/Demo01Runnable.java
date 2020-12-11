package com.itheima.demo03.LambdaTest;

/**
 * @Description：函数式接口作为方法的参数案例
 * @Author 金宇佳
 * @Date 2020/12/11 10:31
 * @Version 1.0
 */

/*
    例如java.lang.Runnable接口就是一个数式接口，
    设有一个 startThread方法使用该接口作为参数,那么就可以使用Lambda进行传参.
    这种情况其实和Thread:类的构造方法参数为 Runnable没有本质区别.
 */
public class Demo01Runnable {
    //定义一个方法startThread,方法的参数使用函数式接口Runnable
    public static void startTread(Runnable run) {
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用startThread方法,方法的参数是一个接口,那么我们可以传递这个接口的匿名内部类
        startTread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了");
            }
        });

        //调用startThread方法,方法的参数是一个函数式接口,所以可以传递Lambda表达式
        startTread(() -> {
            System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了");
        });

        //优化Lambda表达式
        startTread(() -> System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了"));
    }
}
