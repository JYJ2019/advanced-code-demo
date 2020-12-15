package com.itheima.demo09.ConstrutorMethodReference;

/**
 * @Description：类的构造器(构造方法)引用
 * @Author 金宇佳
 * @Date 2020/12/15 11:26
 * @Version 1.0
 */
/*
    类的构造器 (构造方法) 引用
 */
public class Demo {
    //定义一个方法,参数传递姓名和PersonBuilder接口,方法中通过姓名创建Person对象
    public static void printName(String name,PersonBuilder pb) {
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法,方法的参数personBuilder接口是一个函数式接口,可以传递Lambda
        printName("赵丽颖",
                (name) -> {
                    return new Person(name);
                });

        /*
            使用方法引用优化 Lambda表达式
            构造方法 new Person(String name)已知
            创建对象已知 new
            就可以使用 Person引用new创建对象
         */
        printName("张三",Person::new);//使用Person类的带参构造方法,通过传递的姓名创建对象
    }
}
