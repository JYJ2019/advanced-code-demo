package com.itheima.demo03.Generic;

/*
    测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gen = new GenericInterfaceImpl1();
        gen.method("字符串");

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gen2 = new GenericInterfaceImpl2<>();
        gen2.method(2);

        GenericInterfaceImpl2<Double> gen3 = new GenericInterfaceImpl2<>();
        gen3.method(8.9);
    }
}
