package com.itheima.demo04.Reader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description：使用字节流读取中文文件
 * @Author 金宇佳
 * @Date 2020/12/4 10:10
 * @Version 1.0
 */

/*
    使用字节流读取中文文件
    1个中文
        GBK:占用两个字节
        UTF-8:占用3个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09_IOAndProperties\\c.txt");

        /*
            228 189 160 229 165 189
         */
        int len;
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
        }

        fis.close();
    }
}
