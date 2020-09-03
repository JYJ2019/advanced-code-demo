package com.itheima.demo03.Generic;

/*
    测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();

        /*
            调用含有泛型的方法method01
            传递什么类型,泛型就是什么类型
         */
        gm.method01("你");
        gm.method01(true);
        gm.method01(1);
        gm.method01(8.8);

        gm.method02("静态方法,不建议创建对象使用");

        //静态方法,通过类名.方法名(参数)可以直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(true);
        GenericMethod.method02(1);
        GenericMethod.method02(8.8);
    }
}
