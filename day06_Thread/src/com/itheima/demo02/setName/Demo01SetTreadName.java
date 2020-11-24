package com.itheima.demo02.setName;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2020/11/19 19:15
 * @Version 1.0
 */
public class Demo01SetTreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        //开启多线
        new MyThread("旺财").start();
    }
}
