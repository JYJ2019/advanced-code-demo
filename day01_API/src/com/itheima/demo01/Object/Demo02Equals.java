package com.itheima.demo01.Object;

import java.util.Random;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
            Person类默认继承了Object类,所以可以使用Object类的equals方法
            boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。
            Object类equals方法的源码:
                public boolean equals(Object obj) {
                    return (this == obj);
                }
                参数:
                    Object obj:可以传递任意的对象
                方法体:
                    ==:比较运算,返回的就是一个布尔值 true,false
                    基本引用数据类型:比较的是值
                    引用数据类型:比较的是两个对象的地址值
                this是谁?哪个对象调用的方法,方法中的this就是那个对象;
                p1调用的equals方法,所以this就是p1
                obj是谁?传递过来的参数p2
                this == obj --> p1 == p2

         */

        Person p1 = new Person("联合会",14);
        Person p2 = new Person("联合会",14);
//        Person p2 = new Person("联",14);

//        p1 = p2;//把p2的地址值赋值给p1,地址值相同,所以equals方法的结果为true

        System.out.println("p1:" + p1);//p1:com.itheima.demo01.Object.Person@7c30a502
        System.out.println("p2:" + p2);//p2:com.itheima.demo01.Object.Person@49e4cb85

        Random r = new Random();

//        boolean e = p1.equals(p2);
//        boolean e = p1.equals(r);
//        boolean e = p1.equals(null);
        boolean e = p1.equals(p1);

        System.out.println(e);//false
    }
}
