package com.itheima.demo04.MethodReference;

/**
 * @Description：方法引用基本介绍
 * @Author 金宇佳
 * @Date 2020/12/15 8:51
 * @Version 1.0
 */
public class Demo01Printable {
    //定义一个方法,参数传递Printable接口,对字符串进行打印
    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        //调用 printString方法,方法的参数 Printable是一个函数式接口,所以可以传递 Lambda
        // printString(s -> System.out.println(s));

        /*
            分析:
                Lambda表达式的目的,打印参数传递的字符串
                把参数s,传递给了System.out对象,调用out对象中的方法println对字符串进行了输出
                注意:
                    1.System.out对象是已经存在的
                    2.println方法也是已经存在的
                所以我们可以使用方法引用来优化Lambda表达式
                可以使用System.out方法直接引用(调用)println方法
         */
        printString(System.out::println);
    }
}
