package com.itheima.demo04.Calendar;

import java.io.BufferedReader;
import java.util.Calendar;
import java.util.Date;

/*
    Calendar类的成员方法:
        - public int get(int field):返回给定日历字段的值.
        - public void set(int field, int value):将给定的日历字段设置为给定值.
        - public abstract void add(int field, int amount):根据日历的规则,为给定的日历字段添加或减去指定的时间量.
        - public Date getTime():返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象.
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
        public static final int YEAR = 1;年
        public static final int MONTH = 2;月
        public static final int DATE = 5;月中的某一天
        public static final int DAY_OF_MONTH = 5;月中的某一天
        public static final int HOUR = 10;时
        public static final int MINUTE = 12;分
        public static final int SECOND = 13;秒
 */
public class Demo02Calendar {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    /*
        public Date getTime():返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象.
        把日历对象,转换为日期对象
     */
    private static void demo04() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

    }

    /*
        public abstract void add(int field, int amount):根据日历的规则,
        为给定的日历字段添加或减去指定的时间量.
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int amount:增加/减少的值
                正数:增加
                负数:减少
     */
    private static void demo03() {
        //使用getInstance方法获取Calendar对象
        Calendar s = Calendar.getInstance();

        s.add(Calendar.YEAR,-3);
        int i = s.get(Calendar.YEAR);
        System.out.println(i);

        s.add(Calendar.MONTH,1);
        System.out.println(s.get(Calendar.MONTH) + 1);

        s.add(Calendar.DATE,3);
        System.out.println(s.get(Calendar.DATE));
    }

    /*
        public void set(int field, int value):将给定的日历字段设置为给定值.
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int value:传递的字段设置的具体的值
     */
    private static void demo02() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        //同时设置年月日,可以使用set的重载方法
        c.set(1,2,1);
//        c.set(Calendar.YEAR,2088);
        int i = c.get(Calendar.YEAR);
        System.out.println(i);

//        c.set(Calendar.MONTH,5);
        System.out.println(c.get(Calendar.MONTH));

//        c.set(Calendar.DATE,12);
        System.out.println(c.get(Calendar.DATE));

        c.set(Calendar.HOUR,18);
        System.out.println(c.get(Calendar.HOUR));

        c.set(Calendar.MINUTE,59);
        System.out.println(c.get(Calendar.MINUTE));

        c.set(Calendar.SECOND,59);
        System.out.println(c.get(Calendar.SECOND));
    }

    /*
        public int get(int field):返回给定日历字段的值.
        参数:传递指定的日历字段(YEAR,MONTH...)
        返回值:日历字段代表具体的值
     */
    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.YEAR);
        System.out.println(i);

        int i1 = c.get(Calendar.MONTH);
        System.out.println(i1 + 1);//西方的月份0-11 东方:1-12 加一即可

//        int i2 = c.get(Calendar.DATE);
        int i2 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i2);

        System.out.println(c.get(Calendar.HOUR));//时
        System.out.println(c.get(Calendar.MINUTE));//分
        System.out.println(c.get(Calendar.SECOND));//秒
        System.out.println("------------------------------------");
    }
}
