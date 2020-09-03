package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
    增强for循环:底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
    是JDK1.5之后出现的新特性
    Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
    public interface Iterable<T>实现这个接口允许对象成为"foreach"语句的目标

    之前给你for循环:用来遍历集合和数组

    格式:
        for(集合/数组的数据类型 变量名 : 集合名/数组名) {
            sout(变量名);
        }
 */
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();

        System.out.println("----------------------------");

        demo02();
    }

    //使用增强for循环遍历集合
    private static void demo02() {
        Collection<String> coll = new ArrayList<>();

        coll.add("一岁");
        coll.add("二岁");
        coll.add("三岁");

        for (String s : coll) {
            System.out.println(s);//一岁,二岁,三岁
        }
    }

    //使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i : arr) {
            System.out.println(i);//1,2,3,4,5
        }
    }
}
