package com.itheima.demo03.Lambda;

/**
 * @Description：创建Runnable接口的实现类,重写run方法,设置线程任务
 * @Author 金宇佳
 * @Date 2020/11/25 9:31
 * @Version 1.0
 */

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新的线程创建了");
    }
}
