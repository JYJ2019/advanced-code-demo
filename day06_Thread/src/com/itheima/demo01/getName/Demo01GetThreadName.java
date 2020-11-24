package com.itheima.demo01.getName;

/**
 * @Description：获取线程的名称
 * @Author 金宇佳
 * @Date 2020/11/19 17:26
 * @Version 1.0
 */

/*
    线程的名称:
        主线程:main
        新线程: Tread-0, Tread-1, Tread-2
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Tread类的子类对象
        MyTread mt = new MyTread();
        //调用 start 方法,开启新线程,执行 run 方法
        mt.start();//Thread-0

        new MyTread().start();
        new MyTread().start();

        String name = Thread.currentThread().getName();
        System.out.println(name);//main
    }
}
