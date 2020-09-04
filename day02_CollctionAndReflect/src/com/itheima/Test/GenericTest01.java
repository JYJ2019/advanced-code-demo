package com.itheima.Test;

public class GenericTest01 {
    public static void main(String[] args) {
        MyClass<String> mc = new MyClass<>();
        mc.method("me");

        MyClass<Integer> mc2 = new MyClass<>();
        mc2.method(12);


    }
}
