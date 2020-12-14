package com.itheima.demo06.Predicate.Demo01;

import java.util.function.Predicate;

/**
 * @Description：Predicate接口or方法
 * @Author 金宇佳
 * @Date 2020/12/14 9:30
 * @Version 1.0
 */
/*
    逻辑表达式:可以连接多个判断的条件
    &&:与运算符,有false则false
    ||:或运算符,有true则true
    !:非(取反)运算符,非真则假,非假则真

    需求:共断一个字符串,有两个判断的条件
        1.判断字符串的长度是否大于5
        2.判断字符串中是否包含a
    满足一个条件即可,我们就可以使用&&运算符连接两个条件

    Predicate接口中有一个方法or,表示或者关系,也可以用于连接两个判断条件
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonnull(other);
        return (t) -> this.test(t) || other. test(t);
    }
    方法内部的两个判断条件,也是使用 || 运算符连接起来的(源码)
 */
public class Demo03Predicate_or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        // return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);// 等价于 return pre1.test(s) || pre2.test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "af";
        //调用checkString方法,参数传递字符串和两个Lambda表达式
        //判断字符串的长度是否大于5
        //判断字符串中是否包含a
        System.out.println(checkString(s, str -> str.length() > 5, str -> str.contains("a")));

    }
}
