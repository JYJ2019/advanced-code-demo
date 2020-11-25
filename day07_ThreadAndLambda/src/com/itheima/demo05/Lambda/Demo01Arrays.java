package com.itheima.demo05.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description：Lambdo表达式练习
 * @Author 金宇佳
 * @Date 2020/11/25 11:09
 * @Version 1.0
 */

/*
    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个 Person 对象
        对数组中的 Person 对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        //本来年龄乱序的对象数组
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20),
        };

        //匿名内部类
        //第二个参数为排序规则,即Comparator接口实例
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边 - 后边)排序
        /*Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用Lambda表达式,简化匿名内部类
        Arrays.sort(array, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });

        //省略Lambda表达式,简化匿名内部类
        Arrays.sort(array, (a, b) -> a.getAge() - b.getAge());


        // Arrays.sort(array, Comparator.comparingInt(Person::getAge));

        //遍历数组
        for (Person person : array) {
            System.out.println(person);
        }
    }
}
