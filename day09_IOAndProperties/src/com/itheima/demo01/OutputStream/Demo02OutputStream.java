package com.itheima.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Description：一次写多个字节的方法:
 * @Author 金宇佳
 * @Date 2020/12/3 10:15
 * @Version 1.0
 */

/*
    一次写多个字节的方法:
        public void write(byte[] b) : 将b.length字节从指定的字节数组写入此输出流。
        public void write(byte[] b, int off, int len) : 从指定的字节数组写入 len字节,从偏移量 off 开始输出到此输出流.
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个 FileOutputStream对象,构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("day09_IOAndProperties\\b.txt"));
        //2.调用 FileOutputStream 对象中的方法 write, 把数据写入到文件中
        //public abstract void write(int b) : 将指定的字节输出流。
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            public void write( byte[] b): 将b.length字节从指定的字节数组写入此输出流。
            一次写多个字节:
                如果写的第一个字节是正数(0 - 127),那么显示的时候会查询ASCII表
                如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示, 查询系统默认码表 (GBK)
         */
        byte[] bytes = {65, 66, 67, 68, 69};//ABCDE
        // byte[] bytes = {-65, -66, -67, 68, 69};//烤紻E
        fos.write(bytes);

        /*
            public void write(byte[] b, int off, int len) : 把字节数组的一部分写入到文件中
                int off : 数组的开始索引
                int len : 写几个字节
         */
        fos.write(bytes, 1, 2);//bc

        /*
            写入字符的方法:可以使用 String 类中的方法把字符串,转换为字节数组
                byte[] getBytes() 把字符串转换为字节数组
         */

        byte[] bytes1 = "你好".getBytes();//[-28, -67, -96, -27, -91, -67]    (UTF-8)
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);

        //3.释放资源 (流使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率)
        fos.close();
    }
}
