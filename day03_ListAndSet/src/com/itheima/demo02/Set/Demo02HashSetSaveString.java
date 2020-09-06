package com.itheima.demo02.Set;

import java.util.HashSet;

/*
    Set集合不允许存储重复元素的原理
    Set集合在调用add方法的时候,add方法会调用元素的hashCode方法和equals方法,判断元素是否重复
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet对象
        HashSet<String> set = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";//96354
        set.add(s1);
        set.add(s2);
        set.add("重地");//1179395
        set.add("通话");//1179395
        set.add("abc");

        System.out.println(s1.hashCode());
        System.out.println("重地".hashCode());
        System.out.println(set);
    }
}
