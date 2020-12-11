package com.itheima.demo02.Lambda;

/**
 * @Description：日志案例
 * @Author 金宇佳
 * @Date 2020/12/11 8:47
 * @Version 1.0
 */

/*
    日志案例

    发现以下代码存在的一些性能浪费的可问题
    调用showLng方法传递的第二个参数是一个拼接后的字符串
    先把字符串拼接好,然后在调用 showLog方法
    showLog方法中如果传递的日志等级不是1级
    那么就不会是如此拼接后的字符串
    所以感觉字符串就白拼接了,存在了浪费
 */
public class Demo01Logger {
    public static void showLog(int level, String message) {
        //定义一个根据日志的级别,显示日志信息的方法
        if (level == 1) {
            //对日志的等级进行判断,如果是1级别,那么输出日志信息
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1,msg1 + msg2 + msg3);
        // showLog(2,msg1 + msg2 + msg3);
    }




}
