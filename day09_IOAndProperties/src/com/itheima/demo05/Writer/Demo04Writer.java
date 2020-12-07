package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description：续写和换行
 * @Author 金宇佳
 * @Date 2020/12/4 16:17
 * @Version 1.0
 */

/*
    续写和换行
    续写,追加写：使用两个参数的构造方法
        FileWriter(String filename, boolean append)
        FileWriter(File file, boolean append)
        参数:
            String filename, File file：写入数据的目的地
            boolean append：续写开关true：不会创建新的文件覆盖源文件,可以续写; false：创建新的文件覆盖源文件
    换行：换行符号
    windows:\r\n
    Linux: /n
    mac: /r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndProperties\\g.txt", true);
        for (int i = 0; i < 5; i++) {
            fw.write("HelloWorld" + i + "\r\n");
        }

        fw.close();
    }
}
