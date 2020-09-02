package com.itheima.demo07Integer;

import java.util.ArrayList;

/*
    自动装箱与自动拆箱:
        基本类型的数据和包装类之间可以自动的相互装换
        JDK1.5之后出现的新特性
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
            自动装箱:直接把int类型的整数赋值给包装类
            Integer in = 1;就相当于 Integer in = new Integer(1);
         */
        Integer in = 1;

        /*
            自动拆箱:in是包装类,无法直接参与运算,可以自动转换为基本类型的数据,在参与计算
            in + 1;就相当于in.intValue() + 1 = 2;
            in = in + 1;就相当于in = new Integer(2);自动装箱
         */

        in = in + 1;
        System.out.println(in);//2

        //ArrayList集合无法直接储存整数,可以储存integer包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱 list.add(new Integer(1));

        int a = list.get(0);//自动拆箱 list.get(0).intValue();

        System.out.println(a);//1
    }
}
