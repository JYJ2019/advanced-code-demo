package com.itheima.demo01.File;

import java.io.File;
import java.io.IOException;

/**
 * @Description：File类创建删除功能的方法
 * @Author 金宇佳
 * @Date 2020/11/27 22:17
 * @Version 1.0
 */

/*
    File类创建删除功能的方法
        - public boolean createNewFile():当且仅当具有该名称的文件尚不存在时,创建一个新的空文件.
        - public boolean delete() : 删除由此File表示的文件或目录.
        - public boolean mkdir() : 创建由此File表示的目录.
        - public boolean mkdirs() : 创建由此File表示的目录,包括任何必需但不存在的父目录.
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        // show01();
        // show02();
        show03();
    }

    /*
        public boolean delete() : 删除由此File表示的文件或目录.
        此方法,可以删除构造方法路径中给出的文件/文件夹
        返回值:布尔值
            true:文件/文件夹删除成功,返回true
            false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
        注意:
            delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */
    private static void show03() {
        File file = new File("day08_FileAndRecursion\\FileNew");
        boolean delete = file.delete();
        System.out.println(delete);

        File file2 = new File("day08_FileAndRecursion\\FileNew01.txt");
        System.out.println(file2.delete());
    }

    /*
        public boolean mkdir() : 创建单级文件夹
        public boolean mkdirs() : 即可以创建单级文件夹,也可以创建多级
        创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件夹不存在,创建文件夹,返回true
            false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
        注意:
            1.此方法只能创建文件夹,不能创建文件
     */
    private static void show02() {
        File file = new File("day08_FileAndRecursion\\FileNew");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

        File file1 = new File("day08_FileAndRecursion\\FileNew01\\111\\222\\333");
        System.out.println(file1.mkdirs());

        File file2 = new File("day08_FileAndRecursion\\FileNew01.txt");
        System.out.println(file2.mkdirs());//看类型,是一个文件

        File file3 = new File("day\\FileN");
        System.out.println(file3.mkdirs());//不会抛出异常,路径不存在,不会创建
    }

    /*
        public boolean createNewFile() : 当且仅当具有该名称的文件尚不存在时,创建一个新的空文件.
        创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件不存在,创建文件,返回true
            false:文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,否则会抛出异常

       public boolean createNewFile() throws IOException
       createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么try,catch
     */
    private static void show01() throws IOException {
        File f1 = new File("D:\\xxi\\IntellijProject\\advanced-code-demo\\day08_FileAndRecursion\\1.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

        File f2 = new File("day08_FileAndRecursion\\2.txt");
        System.out.println(f2.createNewFile());

        File f3 = new File("day08_FileAndRecursion\\新建文件夹");
        System.out.println(f3.createNewFile());//不要被名称迷糊,要看类型

        File f4 = new File("day08_FileAndRecur\\a.txt");
        System.out.println(f4.createNewFile());//路径不存在,抛出java.io.IOException
    }
}
