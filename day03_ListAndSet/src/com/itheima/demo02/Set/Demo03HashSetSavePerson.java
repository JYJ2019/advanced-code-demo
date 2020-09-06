package com.itheima.demo02.Set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法

    要求:
    同名同年的人,视为同一个人,只能存储一次
 */

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> people = new HashSet<>();

        Person p1 = new Person("蓄势待发", 13);
        Person p2 = new Person("蓄势待发", 13);
        Person p3 = new Person("蓄势待发", 23);

        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1 == p2);//地址值 false
        System.out.println(p2.equals(p1));//false

        System.out.println(people);
    }
}
