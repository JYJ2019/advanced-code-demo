package com.itheima.demo02.Stream;

import java.util.stream.Stream;

/**
 * @Description：Stream流中的常用方法_concat
 * @Author 金宇佳
 * @Date 2020/12/14 19:07
 * @Version 1.0
 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //获取一个Stream流
        String[] arr = {"美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream2 = Stream.of(arr);
        //把以上两个流组合为一个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        //遍历concat流
        concat.forEach(System.out::println);
    }
}
