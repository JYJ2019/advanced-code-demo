package com.itheima.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description：字节输入流
 * @Author 金宇佳
 * @Date 2020/12/3 11:03
 * @Version 1.0
 */

/*
    java.io. InputStream：字节输入流
    此抽象类是表示字节输入流的所有类的超类
    定义了所有子类共性的方法：
        int read() 从输入流中读取数据的下一个字节。
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在緩冲区数组b中。
        void close() 关闭此比输入流并释放与该流关联的所有系统资源
    java.io.FileInputStream extends InputStream
    FileInputStream：文件字节输入流
    作用：把硬盘文件中的数据,读取到内存中使用

    构造方法：
        FileInputStream(String name)
        FileInputStream(File file)
        参数：读取文件的数据源
            String name：文件的路径
            File file：文件
        构造方法的作用:
            1.会创建一个 FileInputStream对象
            2.会把 FileInputStream对象指定构造方法中要读取的文件
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09_IOAndProperties\\a.txt");
       /* int len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);
        */

        /*
            发现以上读取文件是一个重复的过程,所以可以使用循环优化
            不知道文件中有多少字节,使用 while 循环
            while循环结束条件,读取到 -1 的时候结束

            布尔表达式(en = fis.read()) != -1
                1.fis.read() : 读取一个字节
                2.len = fis.read() : 把读取到的字节赋值给变量len
                3.(len = fis.red() != -1 : 判断变量 len 是否不等于 -1
         */
        int len;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }

        //3.释放资源
        fis.close();
    }
}
