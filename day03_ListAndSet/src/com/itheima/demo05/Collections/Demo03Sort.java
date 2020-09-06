package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    - java.util.Collections是集合工具类,用来对集合进行操作.部分方法如下:
        public static <T> void sort(List<T> list, Comparator<? super T>):将集合中元素按照指定规则排序.
    Comparator和Comparable的区别:
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    comparator的排序规则:
        o1 - o2:升序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 2);
        System.out.println(list);//[1, 3, 2]

        Collections.sort(list, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;//降序
                return o1 - o2;//升序
            }
        });

        System.out.println(list);

        ArrayList<Student> lsit02 = new ArrayList<>();
        lsit02.add(new Student("b杨幂", 18));
        lsit02.add(new Student("a迪丽热巴", 18));
        lsit02.add(new Student("古力娜扎", 20));
        lsit02.add(new Student("杨幂", 17));
        System.out.println(lsit02);//[Student{name='迪丽热巴', age=18}, Student{name='古力娜扎', age=20}, Student{name='杨幂', age=17}]

        /*Collections.sort(lsit02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排序
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(lsit02);*///[Student{name='杨幂', age=17}, Student{name='迪丽热巴', age=18}, Student{name='古力娜扎', age=20}]

        Collections.sort(lsit02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    //如果两个人年龄系统,再使用姓名的第一个字比较
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(lsit02);//[Student{name='杨幂', age=17}, Student{name='a迪丽热巴', age=18}, Student{name='b杨幂', age=18}, Student{name='古力娜扎', age=20}]

    }
}
