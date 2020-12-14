package com.itheima.demo02.Stream;

import java.util.stream.Stream;

/**
 * @Description：Stream流中的常用方法_forEach
 * @Author 金宇佳
 * @Date 2020/12/14 16:09
 * @Version 1.0
 */
/*
    Stream流中的常用方法 forEach
    void forEach(Consumer<? super T> action);
    该方法接收一个 Consumer接口数,会将每一个流元素交给该数进行处理.
    Consumer接口是一个消费型的函数式接口,可以传递 Lambda表达式,消费数据

    简单记:
        foreach方法,用来遍历流中的数据
        是一个终结方法,遍历之后就不能继续调用 Stream流中的其他方法
 */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用Stream流中的方法forEach对Stream流中的数据进行遍历
        // stream.forEach( name -> System.out.println(name));
        stream.forEach(System.out::println);
    }
}
