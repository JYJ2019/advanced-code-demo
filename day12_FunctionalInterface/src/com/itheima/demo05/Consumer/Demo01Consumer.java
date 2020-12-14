package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

/**
 * @Description：Consumer<T>
 * @Author 金宇佳
 * @Date 2020/12/12 11:15
 * @Version 1.0
 */

/*
    java.util.function.Consumer<T> 接口则正好与 Supplier 接口相反,
        它不是生产一个数据,而是消费一个数据,其数据类型由泛型决定.
    Consumer 接口中包含抽象方法 void accept(T t),意为消费一个指定泛型的数据.

    Consumer 接口是一个消费型接口,泛型执行什么类型,就可以使用accept方法消费什么类型的数据
    至于具体怎么消费(使用),需要自定义(输出,计算...)
 */
public class Demo01Consumer {
    /*
        定义一个方法
        方法的参数传递一个字符串的姓名
        方法的参数传递 Consumer 接口,泛型使用 String
        可以使用 Consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        //调用 method方法,传递字符串姓名,方法的另一个参数是 Consumer接口,是一个函数式接口,所以可以传递 Lambda表达式
        method("赵丽颖", (String name) -> {
            //对传递的字符串进行消费
            //消费方式：直接输出字符串
            //System.out.println(name);

            //消费方式:把字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);//颖丽赵
        });
    }
}
