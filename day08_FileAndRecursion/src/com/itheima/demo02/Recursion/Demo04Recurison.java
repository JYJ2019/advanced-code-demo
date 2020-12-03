package com.itheima.demo02.Recursion;

import java.io.File;

/**
 * @Description：递归打印多级目录
 * @Author 金宇佳
 * @Date 2020/12/2 11:28
 * @Version 1.0
 */
/*
    练习：
        递归打印多级目录
    需求：
        遍历c:\\abc文件夹，及abc文件夹的子文件夹
        c: \\abc
        c: \\abc\\abc.txt
        c: \\abc\\abc.java
        c: \\abe\\a
        c: \\abc\\a\\a.jpg
        c: \\abc\\a\\a.java
        c: \\abc\\b
        c:\\abc\\b\\b.java
        c: \\abc\\b\\b.txt
 */
public class Demo04Recurison {
    public static void main(String[] args) {
        File file = new File("D:\\xxi\\AppDemo\\abc");
        getAllFile(file);
    }

    /**
     * 定义一个方法，参数传递FiLe类型的目录
     * 方法中对目录进行遍历
     * @param dir
     */
    public static void getAllFile(File dir) {
        System.out.println(dir);
        File[] list = dir.listFiles();
        for (File f : list) {
            //对遍历得到的File对象f进行判断,判断是否是文件夹
            if (f.isDirectory()) {
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所有直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            } else {
                //f是一个文件,直接打印即可
                System.out.println(f);
            }
        }
    }
}
