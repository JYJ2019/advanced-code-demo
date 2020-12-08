package com.itheima.demo03.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @Description：InputStreamReader
 * @Author 金宇佳
 * @Date 2020/12/8 15:54
 * @Version 1.0
 */

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader:是字节流通向字符流的桥梁:它使用指定的 charset 读取字节并将其解码为字符.(解码:把看不懂的变成能看懂的)

    继承自父类的共性成员方法:
        int read()读取单个字符并返回。
        int read(char[] cbuf)一次读取多个字符,将字符读入数组.
        void close()关闭该流并释放与之关联的所有资源.
    构造方法:
        InputStreamReader(InputStream in)创建一个使用默认字符集的 InputStreamReader
        InputStreamReader(InputStream in, String charsetName)创建使用指定字符集的 InputStreamReader
        参数:
            InputStream in:字节输入流,用来读取文件中保存的字节
            String charsetName:指定的编码表名称,不区分大小写,可以是utf-8/UTF-8,gbk/GBK,....不指定默认使用UTF-8
    使用步骤:
        1.创建 InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称
        2.使用 InputStreamReader对象中的方法read读取文件
        3.释放资源
    注意事项:
        构造方法中指定的编码表名称要和文件的编码相同,否则会发生乱码
 */
public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\utf_8.txt"), StandardCharsets.UTF_8);
        // InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\utf_8.txt"), "gbk");//乱码
        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }
        isr.close();
    }
}
