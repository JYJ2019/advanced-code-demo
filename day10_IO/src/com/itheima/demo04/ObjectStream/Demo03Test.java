package com.itheima.demo04.ObjectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * @Description：序列化集合
 * @Author 金宇佳
 * @Date 2020/12/9 11:15
 * @Version 1.0
 */

/*
    练习:序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进行序列化和反序列化
    分析:
        1.定义一个存储 Person对象的 ArrayList集合
        2.往 ArrayList集合中存储 Person 对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream对象中的方法 writeObject,对集合进行序列化
        5.创建一个反序列化ObjectInputStream对象
        6.使用ObjectInputStream对象中的方法 readObject 读取文件中保存的集合
        7.把Object类型的集合转换为 ArrayList 类型
        8.遍历 Arraylist 集合
        9.释放资源
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1.定义一个存储 Person对象的 ArrayList集合
        ArrayList<Person> people = new ArrayList<>();
        //2.往 ArrayList集合中存储 Person 对象
        people.add(new Person("张三",18));
        people.add(new Person("李四",26));
        people.add(new Person("王五",38));
        people.add(new Person("加级",58));
        //3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10_IO\\list.txt"));
        // 4.使用ObjectOutputStream对象中的方法 writeObject,对集合进行序列化
        oos.writeObject(people);
        //5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO\\list.txt"));
        //6.使用ObjectInputStream对象中的方法 readObject 读取文件中保存的集合
        Object o = ois.readObject();
        //7.把Object类型的集合转换为 ArrayList 类型
        ArrayList<Person> list = (ArrayList<Person>) o;
        //8.遍历 Arraylist 集合
        for (Person person : list) {
            System.out.println(person);
            // System.out.println(person.getName() + person.getAge());
        }
        //9.释放资源
        ois.close();
        oos.close();
    }
}
