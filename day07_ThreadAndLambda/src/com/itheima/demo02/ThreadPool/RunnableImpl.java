package com.itheima.demo02.ThreadPool;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2020/11/24 19:21
 * @Version 1.0
 */
//2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
