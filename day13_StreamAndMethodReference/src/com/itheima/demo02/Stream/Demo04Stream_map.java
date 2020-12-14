package com.itheima.demo02.Stream;

import java.util.stream.Stream;

/**
 * @Description：Stream流中的常用方法_map
 * @Author 金宇佳
 * @Date 2020/12/14 16:41
 * @Version 1.0
 */
/*
    如果需要将流中的元素映射到另一个流中,可以使用map方法
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个 Function函数式接口参数,可以将当前流中的T类型数据转换为另一种R类型的流。
    Function中的抽象方法:
        R apply(T t);
 */
public class Demo04Stream_map {
    public static void main(String[] args) {
        //获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法,把字符串类型的整数,转换(映射)为Integer类型的整数
        //遍历Stream2流
        /*Stream<Integer> stream2 = stream.map(s -> Integer.parseInt(s));
        stream2.forEach(i -> System.out.println(i));*/
        stream.map(Integer::parseInt).forEach(System.out::println);
    }
}
