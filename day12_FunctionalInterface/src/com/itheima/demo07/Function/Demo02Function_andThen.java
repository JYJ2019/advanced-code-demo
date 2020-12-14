package com.itheima.demo07.Function;

import java.util.function.Function;

/**
 * @Description：Function接口中的默认方法andThen
 * @Author 金宇佳
 * @Date 2020/12/14 11:39
 * @Version 1.0
 */
/*
    Function接口中的默认方法andThen:用来进行组合操作

    需求:
        把 String 类型的"123",转换为Integer类型,把转换后的结果加10
        把增加之后的Integer类型的数据,转换为String类型

    分析:
        转换了两次
        第一次是把String类型转换为了Integer类型
            所以我们可以使用 Function<String,Integer> fun1
                Integer i = fun1.apply("123") + 10;
        第二次是把Integer类型转换为String类型
            所以我们可以使用 Function<Integer, String> fun2
                String s = fun2.apply(i);
        我们可以使用 andThen方法,把两次转换组合在一起使用
            String s =fun1.andThen(fun2).apply("123");
            fun1先调用apply方法,把字符串转换为Integer
            fun2再调用apply方法,把 Integer转换为字符``串
 */
public class Demo02Function_andThen {
    /*
        定义一个方法
        参数串一个字符串类型的整数
        参数再传递两个 Function 接口
        一个泛型使用 Function<String, Integer>
        一个泛型使用 Function<Integer, String>
     */
    public static void change(String s, Function<String, Integer> fun1, Function<Integer,String> fun2) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String ss = "123";
        //调用change方法,传递字符串和两个Lambda表达式
        // change(ss,str -> Integer.parseInt(str) + 10, i -> i + "");

        //优化lambda表达式
        change(ss,(str) -> Integer.parseInt(str) + 10 , String::valueOf);

    }
}
