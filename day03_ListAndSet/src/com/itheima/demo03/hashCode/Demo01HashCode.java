package com.itheima.demo03.hashCode;

/*
    哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
    在Object类有一个方法,可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值.
    hashCode方法的源码:
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int i = p1.hashCode();
        System.out.println(i);//1967205423

        Person p2 = new Person();
        int i1 = p2.hashCode();
        System.out.println(i1);//42121758

        /*
            toString方法的源码:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1);//com.itheima.demo03.hashCode.Person@75412c2f
        System.out.println(p2);//com.itheima.demo03.hashCode.Person@282ba1e
        System.out.println(p1 == p2);//false

        /*
            String类的哈希值
                String类重写Object类的hashCode方法
         */
        String abc = "abc";
        String abc1 = "abc";
        System.out.println(abc.hashCode());//96354
        System.out.println(abc1.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
