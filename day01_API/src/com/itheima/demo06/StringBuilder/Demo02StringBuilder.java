package com.itheima.demo06.StringBuilder;

/*
    StringBuilder类的成员方法:
        public StringBuilder append(...):添加任意类型数据的字符串形式,
        并返回当前对象自身.
    参数:
        可以是任意的数据类型
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this,调用方法的对象是bu1
//        StringBuilder bu2 = bu1.append("abc");
//        System.out.println(bu1);
//        System.out.println(bu2);
//        System.out.println(bu1 == bu2);//true 两个对象是同一个对象

        //使用append方法无需接收返回值
//        bu1.append("asd");
//        bu1.append(1);
//        bu1.append(2.3);
//        bu1.append('中');
//        System.out.println(bu1);//asd12.3中

        /*
            链式编程:方法的返回值是一个对象,可以根据对象继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());

        System.out.println(bu1.append("abc").append(2).append(1.2).append('中'));

    }
}
