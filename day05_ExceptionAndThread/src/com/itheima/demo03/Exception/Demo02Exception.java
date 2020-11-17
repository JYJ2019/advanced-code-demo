package com.itheima.demo03.Exception;

/**
 * @Description：如果finally有return语句,永远返回finally中的结果,避免该情况
 * @Author 金宇佳
 * @Date 2020/11/17 18:03
 * @Version 1.0
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    /**
     * 定义一个方法,返回变量a的值
     * @return
     */
    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //一定会执行的代码
            a = 100;
            return a;
        }
    }
}
