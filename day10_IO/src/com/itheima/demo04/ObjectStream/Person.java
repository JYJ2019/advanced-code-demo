package com.itheima.demo04.ObjectStream;

import java.io.Serializable;

/**
 * @Description：Serializable接口也叫标记型接口
 * @Author 金宇佳
 * @Date 2020/12/9 9:36
 * @Version 1.0
 */

/*
    序列化和反序列化的时候,会抱出 NotSerializableException没有序列化异常
    类通过实现java.io.Serializable接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
    Serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须实现 Serializable接口,就会给类添加一个标记
        当我们进行序列化和反序列化的时候,就会检测类上是否有这个标记
            有：就可以序列化和反序列化
            没有：就会抛出 NotSerializableException异常
    去市场买肉 --> 肉上有一个蓝色章(检测合格) --> 放心购买 --> 买回来怎么吃随意
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
