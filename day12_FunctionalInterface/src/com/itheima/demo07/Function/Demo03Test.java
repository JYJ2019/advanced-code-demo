package com.itheima.demo07.Function;

import java.util.function.Function;

/**
 * @Description：Function接口练习:自定义函数模型拼接
 * @Author 金宇佳
 * @Date 2020/12/14 14:33
 * @Version 1.0
 */

/*
    练习:自定义函数模型拼接
题目
请使用 Function进行函数模型的拼接,按照顺序需要执行的多个函数操作为:
String str = "赵丽颖,20";

分析:
1.将字符串截取数字年龄部分,得到字符串;
Function<String, String>"赵丽颖,20" -> "20"
2.将上一步的字符串转换成为 int类型的数字;
Function<String, Integer> "20" -> 20
3.将上一步的int数字界加100,得到结果int数字.
Function<Integer, Integer> 20-120
 */
public class Demo03Test {
    public static int change(String s, Function<String,String> fun1,
                              Function<String, Integer> fun2,Function<Integer,Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int num = change(str, s -> s.split(",")[1], Integer::parseInt, i -> i + 100);
        System.out.println(num);
    }
}