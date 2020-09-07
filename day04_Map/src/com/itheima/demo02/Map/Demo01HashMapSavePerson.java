package com.itheima.demo02.Map;

import java.util.HashMap;
import java.util.Map;
/*
    练习：每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到map集合中。
    学生作为键, 家庭住址作为值。

    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("小米", 15), "北京");
        map.put(new Person("小李", 16), "菲律宾");
        map.put(new Person("小张", 17), "武汉");
        map.put(new Person("小米", 15), "上海");//key唯一

        System.out.println(map);//{Person{name='小米', age=15}=上海, Person{name='小李', age=16}=菲律宾, Person{name='小张', age=17}=武汉}

        //使用entrySet和增强for遍历Map集合
        for (Map.Entry<Person, String> set : map.entrySet()) {
            Person key = set.getKey();
            String value = set.getValue();
            System.out.println(key + "-->" + value);
        }
    }

    /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法,可以保证key唯一
            value:Person类型
                value可以重复(同名同年龄的人视为同一个)
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("上海", new Person("小米", 15));
        map.put("广州", new Person("小李", 16));
        map.put("深圳", new Person("小张", 17));
        map.put("上海", new Person("小明", 18));//会替换掉相同 key 的 value

        System.out.println(map);//{上海=Person{name='小明', age=18}, 广州=Person{name='小李', age=16}, 深圳=Person{name='小张', age=17}}

        //使用keySet加增强for遍历Map集合
        for (String key : map.keySet()) {
            Person person = map.get(key);
            System.out.println(key + "-->" + person);
        }
    }
}
