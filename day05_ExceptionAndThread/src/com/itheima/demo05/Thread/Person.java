package com.itheima.demo05.Thread;

/**
 * @Description：测试姓名类
 * @Author 金宇佳
 * @Date 2020/11/19 14:24
 * @Version 1.0
 */
public class Person {
    private String name;

    //定义循环,执行20次
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + "-->" + i);
        }
    }

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
