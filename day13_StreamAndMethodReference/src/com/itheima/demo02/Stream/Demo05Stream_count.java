package com.itheima.demo02.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Description：Stream流中的常用方法_count
 * @Author 金宇佳
 * @Date 2020/12/14 17:12
 * @Version 1.0
 */
/*
    Stream流中的常用方法count:用于统计Stream流中元素的个数
    Long count();
    count方法是一个终结方法,返回值是一个Long类型的整数
    所以不能再继续调用 Stream流中的其他方法了
 */
public class Demo05Stream_count {
    public static void main(String[] args) {
        //获取一个Stream
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);//7
    }
}
