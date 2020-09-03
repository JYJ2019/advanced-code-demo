package com.itheima.Test;

import java.util.Calendar;

/*
    Calendar类
 */
public class CalendarTest02 {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();

        //get方法
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);

        System.out.println("--------------------");

        //set方法
        c.set(Calendar.YEAR,2088);
        year = c.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println("--------------------");
        //add方法
        c.add(Calendar.YEAR,-3);
        year = c.get(Calendar.YEAR);
        System.out.println(year);
    }
}
