package com.itheima.demo01.File;

import java.io.File;
import java.nio.file.Path;

/**
 * @Description：File类获取功能的方法
 * @Author 金宇佳
 * @Date 2020/11/27 9:33
 * @Version 1.0
 */

/*
    File类获取功能的方法
        - public String getAbsolutePath() : 返回此File的绝对路径名字符串.
        - public String getPath() : 将此File转化为路径名字符串.
        - public String getName() : 返回由此File表示的文件或目录的名称.
        - public long length() : 返回由此File表示的文件的长度.
 */
public class Demo03File {
    public static void main(String[] args) {
        // show01();
        // show02();
        // show03();
        show04();
    }

    /*
        public long length() : 返回由此 File 表示的文件的长度.
        获取的是构造方法指定的文件的大小,以字节为单位
        注意:
            文件夹是没有大小概念的,不能获取文件夹的大小
            如果构造方法中给出的路径不存在,那么length方法返回0
     */
    private static void show04() {
        File file = new File("D:\\xzai\\eslintrc.zip");
        long l = file.length();
        System.out.println(l);

        File file1 = new File("D:\\xzai");
        System.out.println(file1.length());//文件夹大小4096, 8192

        File file2 = new File("D:\\xzai\\a.txt");
        System.out.println(file2.length());// 0 不存在文件
    }

    /*
        public S tring getName() : 返回由此File表示的文件或目录的名称.
        获取的就是构造方法传递的结尾部分(文件/文件夹)
     */
    private static void show03() {
        File file = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\a.txt");
        String name = file.getName();
        System.out.println(name);//a.txt

        File file1 = new File("D:\\xxi\\IntellijProject\\advanced-code-demo");
        String name1 = file1.getName();
        System.out.println(name1);//advanced-code-demo
    }

    /*
        public String getPath() : 将此 File转化为路径名字符串.
        获取的构造方法中传递的路径

        toString方法调用的就是getPath方法
        源码:
            public String toString() {
                return getPath();
            }
     */
    private static void show02() {
        File file = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\a.txt");
        String path = file.getPath();
        System.out.println(path);

        File file1 = new File("a.txt");
        String path1 = file1.getPath();
        System.out.println(path1);

        System.out.println(file);
        System.out.println(file.toString());
    }

    /*
        public String getAbsolutePath() : 返回此 File 的绝对路径名字符串.
        获取的构造方法中传递的路径
        无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        File file = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\a.txt");
        String path1 = file.getAbsolutePath();
        System.out.println(path1);

        File file1 = new File("a.txt");
        String path2 = file1.getAbsolutePath();
        System.out.println(path2);


    }
}
