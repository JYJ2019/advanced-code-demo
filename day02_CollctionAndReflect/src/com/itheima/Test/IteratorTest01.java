package com.itheima.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("java");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("--------------");

        for (String s : coll) {
            System.out.println(s);
        }

        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
