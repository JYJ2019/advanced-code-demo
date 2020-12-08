package com.itheima.demo02.CopyFile;

import java.io.*;

/**
 * @Description：文件复制练习:一读一写
 * @Author 金宇佳
 * @Date 2020/12/7 17:24
 * @Version 1.0
 */

/*
    文件复制练习：一读一写

    明确:
        数据源：c:\\1.jpg
        数据的目的地：d:\\1.jpg
    文件复制的步骤:
        1.创建字节缓冲输入流对象,构造方法中传递字节输入流
        2.创建字节缓冲输出流对象,构造方法中传递字节输出流
        3.使用字节缓冲输入流对象中的方法read,读取文件
        4.使用字节缓冲输出流中的方法 write,把读取的数据写入到内部缓冲区中
        5.释放资源(会先把缓冲区中的数据,刷新到文件中)
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\a.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:" + (e - s) + "毫秒");
    }
}
