package com.itheima.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("world");
        list.add("hello");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(4);
        list1.add(3);

        method(list);
        method(list1);
    }

    private static void method(ArrayList<?> e) {
        Iterator<?> it = e.iterator();

        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
