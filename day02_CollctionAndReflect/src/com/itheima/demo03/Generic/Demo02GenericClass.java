package com.itheima.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型默认Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能储存字符串");

        Object name = gc.getName();
        System.out.println(name);

        //创建GenericClass对象,泛型使用String类型
        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setName("字符串");
        String name2 = gc2.getName();
        System.out.println(name2);

        //创建GenericClass对象,泛型使用Integer类型
        GenericClass<Integer> gc3 = new GenericClass<>();
        gc3.setName(2);
        Integer name3 = gc3.getName();
        System.out.println(name3);
    }
}
