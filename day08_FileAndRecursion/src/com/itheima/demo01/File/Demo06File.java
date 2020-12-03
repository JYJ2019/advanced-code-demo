package com.itheima.demo01.File;

import java.io.File;

/**
 * @Description：File类遍历(文件夹)目录功能
 * @Author 金宇佳
 * @Date 2020/12/1 17:17
 * @Version 1.0
 */

/*
    File类遍历(文件夹)目录功能
        - public String[] list() : 返回一个String数组,表示该File目录中的所有子文件或目录.
        - public File[] listFiles() : 返回一个File数组,表示该File目录中的所有的子文件或目录.

    注意:
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会批出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
        // show01();
        show02();
    }

    /*
        - public File[] listFiles() : 返回一个File数组,表示该File目录中的所有的子文件或目录.
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把文件/文件夹封装为FiLe对象,多个FiLe对象存储到FiLe数组中
     */
    private static void show02() {
        File file = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\day08_FileAndRecursion");
        // File file = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\day08_Fil");//NullPointerException
        // File file = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\day08_FileAndRecursion\\1.txt");//NullPointerException
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    /*
         - public String[] list() : 返回一个String数组,表示该File目录中的所有子文件或目录.
           遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称储存到一个String类型的数组中
     */
    private static void show01() {
        File f1 = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\day08_FileAndRecursion");
        // File f1 = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\day08_FileAndRecursion \\1.txt");//NullPointerException
        // File f1 = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\day08_Fil");//NullPointerException
        String[] arr = f1.list();
        for (String filename : arr) {
            System.out.println(filename);
        }

    }
}
