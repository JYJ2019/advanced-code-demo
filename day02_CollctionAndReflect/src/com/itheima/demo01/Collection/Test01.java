package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
    boolean add(E e);       向集合中添加元素
    boolean remove(E e);    删除集合中的某个元素
    void clear();           清空集合所有的元素
    boolean contains(E e);  判断集合中是否包含某个元素
    boolean isEmpty();      判断集合是否为空
    int size();             获取集合的长度
    Object[] toArray();     将集合转成一个数组
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        //boolean add(E e);       向集合中添加元素
        coll.add("Hello");
        coll.add("World");
        coll.add("Heima");
        coll.add("Java");

        System.out.println(coll);//[Hello, World, Heima, Java]

        //boolean remove(E e);    删除集合中的某个元素
        boolean hello = coll.remove("Hello");
        System.out.println(hello);//true
        System.out.println(coll);//[World, Heima, Java]

        //void clear();           清空集合所有的元素
//        coll.clear();
//        System.out.println(coll);//[]

        //boolean contains(E e);  判断集合中是否包含某个元素
        boolean java = coll.contains("World");
        System.out.println(java);//true

        //boolean isEmpty();      判断集合是否为空
        boolean empty = coll.isEmpty();
        System.out.println(empty);//false

        //int size();             获取集合的长度
        int size = coll.size();
        System.out.println(size);//3

        //Object[] toArray();     将集合转成一个数组
        Object[] array = coll.toArray();
        for(Object o: array){
            System.out.println(o);
        }

    }
}
