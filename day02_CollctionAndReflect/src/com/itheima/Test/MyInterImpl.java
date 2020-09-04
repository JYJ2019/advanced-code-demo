package com.itheima.Test;

public class MyInterImpl<O> implements MyInter<O> {
    @Override
    public void method(O o) {
        System.out.println(o);
    }
}
