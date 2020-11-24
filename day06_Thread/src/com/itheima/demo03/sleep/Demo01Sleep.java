package com.itheima.demo03.sleep;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2020/11/19 19:49
 * @Version 1.0
 */

/*
    public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停(暂停停止执行).
    毫秒数结束之后,线程继续执行
 */
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
