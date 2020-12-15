package com.itheima.demo05.ObjectMethodReference;

/**
 * @Description：定义一个打印的函数式接口
 * @Author 金宇佳
 * @Date 2020/12/15 8:51
 * @Version 1.0
 */
/*
    定义一个打印的函数式接口
 */
@FunctionalInterface
public interface Printable {
    //定义字符串的抽象方法
    void print(String s);
}
