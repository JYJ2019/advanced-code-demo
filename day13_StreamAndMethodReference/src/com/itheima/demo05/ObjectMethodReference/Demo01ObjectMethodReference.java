package com.itheima.demo05.ObjectMethodReference;

/**
 * @Description：通过对象名引用成员方法
 * @Author 金宇佳
 * @Date 2020/12/15 9:14
 * @Version 1.0
 */

/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的，成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
    //定义一个方法,方法的参数传递Printable接口
    public static void printString(Printable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        //调用printString方法,方法的参数Printable是一个函数式接口,所以可以传递Lambda表达式
        /*printString((str) -> {
            //创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            //调用MethodRetObject对象中的成员方法printUpperCaseString,把字符串按照大写输出
            obj.printUpperCaseString(str);
        });*/

        /*
            使用方法引用优化 lambda
            对象是已经存在的 MethodRerObject
            成员方法也是已经存在的 printUpperCaseString
            所以我们可以使用对象名引用成员方法
         */
        //创建MethodRerObject对象
        printString(new MethodRerObject()::printUpperCaseString);
    }
}
