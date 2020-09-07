package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LikedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现,具有可预知的迭代顺序.
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("a", "a");
        hash.put("d", "d");
        hash.put("c", "c");
        hash.put("a", "b");

        System.out.println(hash);// key不允许重复,无序 {a=b, c=c, d=d}

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("b", "b");
        linked.put("c", "c");
        linked.put("a", "b");

        System.out.println(linked);//key不允许重复,有序 {a=b, b=b, c=c}
    }
}
