package com.itheima.demo06.Lambda;

import java.sql.SQLOutput;

/**
 * @Description：Lambda表达式有参数有返回值的练习
 * @Author 金宇佳
 * @Date 2020/11/25 21:27
 * @Version 1.0
 */

/*
    Lambda表达式有返回值的练习
    需求:
        给定一个计算器Calculator接口,内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法,完成120和130的相加计算
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        //调用invokeCalc方法,方法的参数是一个接口,可以使用匿名内部类
        /*invokeCalc(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });*/

        //使用Lambda表达式简化匿名内部类的书写
        invokeCalc(120 ,130, (int a, int b) -> {
            return a + b;
        });

        //省略Lambda表达式简化匿名内部类的书写
        invokeCalc(120 ,130, (a, b) -> a + b);
    }

    /**
     * 定义一个方法
     * 参数传递两个int类型的整数
     * 参数传递Calculator接口
     * 方法内部调用Calculator中的方法calc计算两个整数的和
     * @param a
     * @param b
     * @param c
     */
    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
