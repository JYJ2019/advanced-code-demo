package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map.Entry<K,V>:在Map接口中有一个内部接口Entry
    作用:当Map集合一创建,那么就会在Map集合中创建一个Entry对象,用来记录键与值(键值对对象,键与值的映射关系)-->结婚证
    Map集合遍历的第二张方式:使用Entry对象遍历

    Map集合中的方法:
        Set<Map.Entry<k,v>> entrySet()返回此映射中包含的映射关系的 Set 视图.

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class DEemo03EntrySet {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("林志玲", 178);
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);

        //1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();

        //2.遍历Set集合,获取每一个Entry对象
        //使用迭代器遍历Set集合
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();

            //3.使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("-------------------------------");

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            //3.使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
