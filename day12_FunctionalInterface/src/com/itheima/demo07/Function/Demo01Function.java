package com.itheima.demo07.Function;

import java.util.function.Function;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2020/12/14 10:44
 * @Version 1.0
 */
/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据,
        前者称为前置条件,后者为后置条件.
    Function接口中最主要的抽象方法为:R apply(T t),根据类型 T 的参数获取类型 R 的结果.
        使用的场景例如: 将String类型转换为Integer类型.
 */
public class Demo01Function {
    /*
        定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的参数传递一个 Function接口,泛型使用<String, Integer>
        使用 Function接口中的方法apply,把字符串类型的整数,转换为 Integer类型的整数
     */
    public static void change(String s, Function<String, Integer> fun) {
        // Integer in = fun.apply(s);
        int in = fun.apply(s);//自动拆箱 Integer -> int
        System.out.println(in);
    }

    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String s = "1234";
        //调用change方法,传递字符串字符类型的整数,和Lambda表达式
        //把字符串类型的整数,转换为Integer类型的整数返回
        // change(s,str -> Integer.parseInt(str));

        //优化Lambda
        change(s, Integer::parseInt);
    }
}
