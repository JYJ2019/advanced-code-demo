package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description：java.io.Writer：字符输出流。
 * @Author 金宇佳
 * @Date 2020/12/4 10:56
 * @Version 1.0
 */

/*
    java.io.Writer：字符输出流。是所有字符输流出的最顶层的父类,是一个抽象类

    共性的成员方法
        void write(int c) 写入单个字符。
        void write(char[] cbuf) 写入字符数组。
        abstract void write(char[] cbuf, int off, int len）写入字符数组的某一部分,0ff放数组的开始素引,len写的字符个数.
        void write(String str) 写入字符串。
        void write(String str, int off, int len）写入字符串的某一部分,off字符串的开始素引,len写的字符个数
        void flush() 刷新该流的緩冲.
        void close() 关闭此流,但要先刷新它。

    java.io.FileWriter extends OutputStreamRiter extends writer
    FileWriter：文件字符输出流
    作用：把内存中字符数据写入到文件中

    构造方法：
        FileWriter(File file): 根据给定的File对象构造一个 FileWriter 对象。
        FileWriter(String filename) 根据给定的文件名构造一个 FileWriter对象。
        参数:写入数据的目的地
            String fileName：文件的路径
            File file：是一个文件
        构造方法的作用:
            1.会创建一个 FileWriter对象
            2.会根据构造方法中传递的文件/文件的路径，创建文件
            3.会把 FileWriter对象指向创建好的文件
    字符输出流的使用步骤（重点）
        1.创建 FileWriter对象,构造方法中绑定要写入数据的目的地
        2.使用 FileWriter中的方法 write,把数据写入到内存冲区中(字符转换为字节的过程)
        3.使用 FileWriter中的方法 flush,把内存缓冲区中的数据,刷新到文件中
        4.释放资源(会先把内存冲区中的数据刷新到文件中)
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        // 1.创建 FileWriter对象,构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("day09_IOAndProperties\\d.txt");
        // 2.使用 FileWriter中的方法 write,把数据写入到内存冲区中(字符转换为字节的过程)
        // void writ(int c) 写入单个字符
        fw.write(97);
        // 3.使用 FileWriter中的方法 flush,把内存缓冲区中的数据,刷新到文件中
        // fw.flush();
        // 4.释放资源(会先把内存冲区中的数据刷新到文件中)
        fw.close();
    }
}
