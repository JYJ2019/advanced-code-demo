package com.itheima.demo03.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
    练习:
        计算一个字符串中每一个字符出现次数

    分析:
        1.使用Scanner获取用户输入的字符串
        2.创建Map集合,key是字符串中的字符串,value是字符的个数
        3.遍历字符串,获取每一个字符
        4.使用获取到的字符,去Map集合判断key是否存在
            key存在:
                通过字符(key),获取value(字符个数)
                value++
                put(key,value)把新的value存储到Map集合中
            Key不存在:
                put(key,1)
        5.遍历Map集合,输出结果
 */
public class Demo03MapTest {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入一个字符串:");
        String str = buff.readLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {
            if (map.containsKey(key)) {
                Integer value = map.get(key);
//                System.out.println(value);
                value++;
                map.put(key, value);
            } else {
                map.put(key, 1);//首次运行map.containsKey(key)必为false进入
            }
        }
        for (Character key :map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
