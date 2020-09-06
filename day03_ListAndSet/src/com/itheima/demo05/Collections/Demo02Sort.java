package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    -java.util.Collections是集合工具类,用来对集合进行操作.部分方法如下:
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序.

    注意:
        sort(List<T> list)使用前提
        被排序的集合里面存储的元素,必须试下Comparable,重写接口中的方法compareTo定义排序的规则

        Comparable接口的排序规则:
            自己(this) - 参数:升序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 8, 6, 3, 5, 7);
        System.out.println(list);//[1, 8, 6, 3, 5, 7]
        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序.
        Collections.sort(list);//默认是升序
        System.out.println(list);//[1, 3, 5, 6, 7, 8]

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "c", "d", "a", "b", "f", "g");
        System.out.println(list1);//[c, d, a, b, f, g]
        Collections.sort(list1);
        System.out.println(list1);//[a, b, c, d, f, g]

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("问答", 21));
        people.add(new Person("信息", 12));
        people.add(new Person("斯蒂芬", 14));

        System.out.println(people);//[Person{name='信息', age=12}, Person{name='问答', age=19}, Person{name='斯蒂芬', age=14}]

        Collections.sort(people);
        System.out.println(people);//[Person{name='信息', age=12}, Person{name='斯蒂芬', age=14}, Person{name='问答', age=19}]
    }
}
