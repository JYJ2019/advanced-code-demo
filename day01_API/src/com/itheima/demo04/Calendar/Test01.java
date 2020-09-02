package com.itheima.demo04.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Date类
 */
public class Test01 {
    public static void main(String[] args) throws ParseException {
        //空参的构造方法
        Date d = new Date(3000L);
        System.out.println(d.toLocaleString());//过时的

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(d);
        System.out.println(format);

        String s = "2088年08月08日 08:08:08";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}

