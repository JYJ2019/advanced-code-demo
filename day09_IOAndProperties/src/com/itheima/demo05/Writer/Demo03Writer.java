package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description：字符输出流写数据的其他方法
 * @Author 金宇佳
 * @Date 2020/12/4 15:15
 * @Version 1.0
 */

/*
    字符输出流写数据的其他方法
        void write(char[] cbuf) 写入字符数组。
        abstract void write(char[] cbuf, int off, int len）写入字符数组的某一部分,0ff放数组的开始素引,len写的字符个数.
        void write(String str) 写入字符串。
        void write(String str, int off, int len）写入字符串的某一部分,off字符串的开始素引,len写的字符个数
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndProperties\\f.txt");
        char[] chars = {'A','B','D','E','F'};
        //void write(char[] cbuf) 写入字符数组。
        fw.write(chars);//ABDEF
        //void write(char[] cbuf, int off, int len）写入字符数组的某一部分,0ff放数组的开始素引,len写的字符个数.
        fw.write(chars,1,2);//BD
        //void write(String str) 写入字符串。
        fw.write("创造最佳");//创造最佳
        //void write(String str, int off, int len）写入字符串的某一部分,off字符串的开始素引,len写的字符个数
        fw.write("创造最佳",1,2);//最佳

        fw.close();
    }
}
