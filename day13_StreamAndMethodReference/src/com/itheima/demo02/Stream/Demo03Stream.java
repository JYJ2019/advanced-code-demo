package com.itheima.demo02.Stream;

import java.util.stream.Stream;

/**
 * @Description：Stream流中的常用方法_filter
 * @Author 金宇佳
 * @Date 2020/12/14 16:23
 * @Version 1.0
 */
/*
    Stream流中的常用方法 filter:用于对 Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate);
    filter方法的参数 Predicate是一个函数式接口,所以可以传递 Lambda表达式,对数据进行过滤
    Predicate中的抽象方法
        boolean test(T t);
 */
public class Demo03Stream {
    public static void main(String[] args) {
        //创建一个Stream
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //对Stream流中的元素进行过滤,只要姓张的人
        Stream<String> stream2 = stream.filter(name -> name.startsWith("张"));
        //遍历stream2流
        stream2.forEach(System.out::println);

        /*
            Stream流属于管道流,只能被消费(使用)一次
            第一个Stream流调用完毕方法,数据就会转到下ー个Stream上
            而这时第一个Stream流已经使用完毕,就会关闭了
            所以第一个Stream流就不能再调用方法了
            IllegalStateException: stream has already been operated upon or closed(流已经被关闭)
         */
        //遍历stream流
        // stream.forEach(System.out::println);

    }
}
