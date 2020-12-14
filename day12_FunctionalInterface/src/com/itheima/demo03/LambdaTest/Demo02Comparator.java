package com.itheima.demo03.LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description：返回值类型是一个函数式接口
 * @Author 金宇佳
 * @Date 2020/12/11 14:55
 * @Version 1.0
 */

/*
    如果一个方法的返回值类型是一个函数式接口,那么就可以直接返回一个Lambda表达式.
    当需要通过一个方法来获取ー个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取.
 */
public class Demo02Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口 Comparator
    public static Comparator<String> getComparator() {
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };*/

        //方法的返回值类型是一个函数式接口,所有我们可以返回一个Lambda表达式
        /*return (String o1, String o2)->{
            //按照字符串的降序排序
            return o2.length() - o1.length();
        };*/

        //继续优化Lambda表达式
        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        //创建一个字符串数组
        String[] arr = {"aaa", "b", "ccccc", "ddddddddddddd"};
        //输出排序前的数组
        System.out.println(Arrays.toString(arr));//[aaa, b, ccccc, ddddddddddddd]
        //调用Arrays中的sort方法,对字符串数组进行排序
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));//[ddddddddddddd, ccccc, aaa, b]
    }
}
