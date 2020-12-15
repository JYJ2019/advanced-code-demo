package com.itheima.demo09.ConstrutorMethodReference;

/**
 * @Description：定义一个创建Person对象的函数式接口
 * @Author 金宇佳
 * @Date 2020/12/15 11:19
 * @Version 1.0
 */
/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法,根据传递的姓名,创建Person对象返回
    Person builderPerson(String name);
}
