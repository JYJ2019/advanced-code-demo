package com.itheima.demo07.Lambda;

import java.util.ArrayList;

/**
 * @Description：Lambda表达式:是可推导,可以省略
 * @Author 金宇佳
 * @Date 2020/11/25 22:51
 * @Version 1.0
 */

/*
    Lambda表达式:是可推导,可以省略
    凡是根据上下为推导出来的内容,都可以省略书写
    可以省略的内容:
        1.(参数列表): 括号中参数列表的数据类型,可以省略不写
        2.(参数列表): 括号中的参数如果只有一个,那么类型和()都可以省略
        3.{一些代码}: 如果{}中的代码只有一行,无论是否有返回盒子,都可以省略({},return,分号)
            注意:要省略{},return,分号必须一起省略
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //JDK 1.7 版本之前,创建集合对象必须把前后的泛型都写上
        ArrayList<String> list = new ArrayList<String>();

        //JDK1.7 之后,=号后面的泛型可以省略,后面的泛型可以根据起前面的泛型推导出来
        ArrayList<String> list1 = new ArrayList<>();

        /*
            Lambda的语法非常简洁，完全没有面向对象复杂的束缚。但是使用时有几个问题需要特别注意：
            1. 使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法。
               无论是JDK内置的 Runnable 、Comparator 接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用Lambda。
            2. 使用Lambda必须具有上下文推断。
                也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
           备注：有且仅有一个抽象方法的接口，称为“函数式接口”。
         */
    }
}
