package com.itheima.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description：文件复制练习:一读一写
 * @Author 金宇佳
 * @Date 2020/12/3 16:48
 * @Version 1.0
 */

/*
    文件复制练习: 一读一写

    明确:
        数据源: C:\\1.jpg
        数据的目的地: d:\\1.jpg

    文件复制的步骤:
        1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
        5.释放资源
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        // 1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\a.jpg");
        // 2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("C:\\a.jpg");

        //使用数组缓冲读取多个字节,写入多个字节
        byte[] bytes = new byte[1024];
        //3.使用字节输入流对象中的方法read读取文件
        int len;
        while ((len = fis.read(bytes)) != -1) {
            // 4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(bytes,0,len);
        }

        long e = System.currentTimeMillis();

        //5.释放资源(先关写的,后关闭读的;如果写完了,肯定读取完了)
        fos.close();
        fis.close();
        System.out.println("运行毫秒值:" + (e - s) + "毫秒");
    }
}