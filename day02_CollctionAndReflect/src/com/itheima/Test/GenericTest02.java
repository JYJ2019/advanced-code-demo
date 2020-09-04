package com.itheima.Test;

public class GenericTest02 {
    public static void main(String[] args) {
        MyInterImpl<Integer> mi = new MyInterImpl<>();
        mi.method(2);

        MyInterImpl<Boolean> mi2 = new MyInterImpl<>();
        mi2.method(true);
    }
}
