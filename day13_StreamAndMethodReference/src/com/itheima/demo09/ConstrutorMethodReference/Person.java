package com.itheima.demo09.ConstrutorMethodReference;

/**
 * @Description：Person
 * @Author 金宇佳
 * @Date 2020/12/15 11:19
 * @Version 1.0
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
