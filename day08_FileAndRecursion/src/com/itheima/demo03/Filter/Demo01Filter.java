package com.itheima.demo03.Filter;

import java.io.File;

/**
 * @Description：ListFiles重载的方法
 * @Author 金宇佳
 * @Date 2020/12/2 15:41
 * @Version 1.0
 */

/*
        c: \\abc
        c: \\abc\\abc.txt
        c: \\abc\\abc.java
        c: \\abe\\a
        c: \\abc\\a\\a.jpg
        c: \\abc\\a\\a.java
        c: \\abc\\b
        c:\\abc\\b\\b.java
        c: \\abc\\b\\b.txt
    我们可以使用过滤器来实现
    在File类中有两个和ListFiles重载的方法,方法的参数传递的就是过滤器
    File[] ListFiles(FileFilter filter)
    java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器。
        作用：用来过滤文件（File对象）
        抽象方法：用来过滤文件的方法
            boolean accept(File pathname）测试指定抽象路径名是否应该包含在某个路径名列表中。
        参数:
            File pathname：使用 ListFiles方法遍历目录，得到的每一个文件对象
    File[] ListFiles(FilenameFilter filter)
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名。
        作用:用于过滤文件名称
        抽象方法：用来过滤文件的方法
            boolean accept(File dir, String name）测试指定文件是否应该包含在某一文件列表中。
        参数:
            File dir：构造方法中传递的被遍历的目录
            String name：使用 ListFiles 方法遍历目录，获取的每一个文件/文件夹的名称
    注意:
        两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法 accept，在方法中自己定义过滤的规则
 */
public class Demo01Filter {
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
        // System.out.println(dir);
        File[] list = dir.listFiles(new FileFilterImpl());
        //传递过滤器对象
        for (File f : list) {
            //对遍历得到的File对象f进行判断,判断是否是文件夹
            if (f.isDirectory()) {
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所有直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            } else {
                //f是一个文件,直接打印即可
                /*
                    1.把File对象f,转为字符串对象
                        把字符串,转换为小写
                    2.调用String类中的方法endsWith判断字符串是否是以.java结尾
                    3.如果是以.java结尾的文件,则输出
                        链式编程
                 */
                if (f.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(f);
                }
            }
        }
    }
}
