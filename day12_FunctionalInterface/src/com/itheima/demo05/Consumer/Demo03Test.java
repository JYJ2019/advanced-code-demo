package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

/**
 * @Description：练习
 * @Author 金宇佳
 * @Date 2020/12/12 15:00
 * @Version 1.0
 */

/*
    练习：
        字符串数组当中存有多条信息,请按照格式"姓名:xx.性别:xx."的格式将信息打印出来.
        要求将打印姓名的动作作为第一个 Consumer接口的 Lambda实例.
        将打印性别的动作作为第二个 Consumer接口的 Lambda实例,
        将两个 Consumer接口按照顺序拼接一起。
 */
public class Demo03Test {
    //定义一个方法,参数传递 String 类型的数组和两个 Consumer 接口,泛型使用 String
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        //遍历字符串数组
        for (String message : arr) {
            //使用 andThen 方法连接两个 Consumer 接口,,消费字符串
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        //定义一个字符串类型的数组
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};

        //用 printInfo方法,传递一个字符串数组,和两个Lambda表达式
        printInfo(arr,
                (message) -> {
                    //消费方式:对 message 进行切割,获取姓名,按照指定的格式输出
                    String name = message.split(",")[0];
                    System.out.print("姓名:" + name);
                },
                (message) -> {
                    //消费方式:对 message进行切割,获取年龄,按照指定的格式输出
                    String age = message.split(",")[1];
                    System.out.println(".性别:" + age + ".");
                });
    }

}
