package com.itheima.demo05.System;

import java.util.Arrays;

/*
    java.lang.System类中提供了大量的静态方法,可以获取与系统相关的信息或系统级操作,在System类的API文档中,常用的方法有:
        - public static long currentTimeMillis():返回以毫秒为单位的当前时间.
        -public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length):
            将数组中指定的数据拷贝到另一个数组中.
 */
public class Demo01System {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    /*
        public static void arraycopy(Object src, int srcPos,Object dest, int destPos, int length):
            将数组中指定的数据拷贝到另一个数组中.
        参数:
            src - 源数组
            srPos - 源数组中的起始位置.
            dest - 目标数组.
            destPos - 目标数据中的起始位置.
            length - 要复制的数组元素的数量.
        练习:
            将src数组中前3个元素，复制到dest数组的前3个位置上
            复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
            复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */
    private static void demo02() {
        //定义源数组
        int[] src = {1, 2, 3, 4, 5};
        //定义目标数组
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制元素前" + Arrays.toString(dest));

        //使用System类的方法arraycopy,将src数组中前3个元素，复制到dest数组的前3个位置上
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制元素后" + Arrays.toString(dest));
    }

    /*
        验证for循环打印数字1-9999所需要使用的时间（毫秒）
     */
    private static void demo01() {
        long s = System.currentTimeMillis();

        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();

        System.out.println("共耗时毫秒:" + (e - s));
    }
}
