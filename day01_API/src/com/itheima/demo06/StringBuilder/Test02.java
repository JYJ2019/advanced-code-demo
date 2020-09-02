package com.itheima.demo06.StringBuilder;

/*
    StringBuilder类
 */
public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //append方法
        /*
        sb.append("hello");
        sb.append(true);
        sb.append(100);
         */
        sb.append("hello").append("world").append("java");

        //reverse方法
        sb.reverse();

        //toString方法
        System.out.println(sb);
    }
}
