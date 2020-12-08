package com.itheima.demo01.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description：BufferedInputStream字节缓冲输入流
 * @Author 金宇佳
 * @Date 2020/12/7 16:48
 * @Version 1.0
 */

/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream:字节冲输入流

    继承自父类的成员方法:
        int read()从输入流中读取数据的下ー个字节.
        int read(byte[] b)从输入流中读取一定数量的字节,并将其存储在缓冲区数组 b 中.
        void close()关闭此输入流并释放与该流关联的所有系统资源.

    构造方法:
        BufferedInputStream(InputStream in)创建一个 BufferedInputStream并保存其参数,即输入流 in,以便将来使用.
        BufferedInputStream(InputStream in, int size)创建具有指定缓冲区大小的 BufferedInputStream并保存其参数,即输入流
        参数:
            InputStream in:字节输入流
                我们可以传递 FileInputStream,缓冲流会给 FileInputStream增加一个缓冲区提高 FileInputStream的读取效率
            int size:指定缓冲流内部缓冲区的大小,不指定默认

    使用步骤(重点)：
        1.创建 FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建BufferedInput Stream对象,构造方法中传递FileInputStream对象,提高FileInputStream对象的读取效率
        3.使用BufferedInput Stream对象中的方法read,读取文件
        4.释放资源
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建 FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day10_IO\\a.txt");
        //2.创建BufferedInput Stream对象,构造方法中传递FileInputStream对象,提高FileInputStream对象的读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3.使用BufferedInput Stream对象中的方法read,读取文件
        //int read()从输入流中读取数据的下一个字节.
        /*int len;//记录每次读取到的字节
        while ((len = bis.read()) != -1) {
            System.out.println(len);
        }*/

        //int read(byte[] b) 从输入流中读取一定数量的字节,并将其存储在缓冲区数组 b 中.
        byte[] bytes = new byte[1024];//存储每次读取的数据
        int len;//记录每次读取的有效字节个数
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //4.释放资源
        bis.close();
    }
}
