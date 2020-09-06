package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组 + 链表 / 红黑树) + 链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("aaa");
        hash.add("www");
        hash.add("aaa");
        hash.add("java");
        System.out.println(hash);//[aaa, java, www] 无序,不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("aaa");
        linked.add("www");
        linked.add("aaa");
        linked.add("java");
        System.out.println(linked);//[aaa, www, java] 有序,不允许重复

    }
}
