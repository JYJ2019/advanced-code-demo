package com.itheima.demo01.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是有个链表结构;查询慢,增删快
        2.里面包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入到列表的开头.
        - public void addLast(E e):将指定元素添加到此列表的结尾.
        - public void push(E e):将元素推入此列表所表示的堆栈.

        - public E getFirst():返回此列表的第一个元素.
        - public E getLast():返回此列表最后一个元素.

        - public E removeFirst():移除并返回此列表的第一个元素.
        - public E removeLast():移除并返回此列表最后一个元素.
        - public E pop():从此列表所表示的堆栈处弹出一个元素.

        - public boolean isEmpty():如果列表不包含元素,则返回true
 */
public class Demo02linkedList {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }


    /*
        - public E removeFirst():移除并返回此列表的第一个元素.
        - public E removeLast():移除并返回此列表的最后一个元素.
        - public E pop():此列表所表示的堆栈处弹出一个元素.此方法相当于 removeFirst
     */
    private static void show03() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//        String first = list.removeFirst();
        String first = list.pop();//等价于removeFirst
        System.out.println("移除的第一个元素:" + first);
        String last = list.removeLast();
        System.out.println("移除的最后一个元素:" + last);

    }

    /*
        - public void addFirst(E e):将指定元素插入此列表的开头.
        - public void addLast(E e):将指定元素添加到此列表的结局.
        - public void push(E e):将元素推入此列表所表示的堆栈此方法等效于 addFirst(E).
     */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> list = new LinkedList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        list.addFirst("www");
        list.push("www");//等价于 addFirst
        list.addLast("com");
        System.out.println(list);//[www, a, b, c, d, com]
    }

    /*
        - public E getFirst():返回此了列表的第一个元素.
        - public E getLast():返回此列表的最后一个元素.
     */
    private static void show01() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list);//[a, b, c, d]
//        list.clear();//清空集合中的元素 在获取集合中的元素会抛出NoSuchElementException

        //public boolean isEmpty():如果列表不包含元素,则返回true.
        if (!list.isEmpty()) {
            String first = list.getFirst();
            System.out.println("第一个元素是:" + first);//第一个元素是:a
            String last = list.getLast();
            System.out.println("最后一个元素是:" + last);//最后一个元素是:d
        }
    }
}
