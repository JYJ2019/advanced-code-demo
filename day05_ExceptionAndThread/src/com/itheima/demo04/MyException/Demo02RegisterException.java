package com.itheima.demo04.MyException;

import java.util.Scanner;

/**
 * @Description：自定义异常类的练习
 * @Author 金宇佳
 * @Date 2020/11/18 18:38
 * @Version 1.0
 */

//RuntimeException
public class Demo02RegisterException {
    static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String username = sc.next();
        checkUsername(username);
    }

    public static void checkUsername(String username) {
        for (String name : usernames) {
            if (username.equals(name)) {
                throw new RegisterException("亲,该用户名已经被注册");//抛出运行期异常,无需处理,交给JVM处理,中断处理
            }
        }
        System.out.println("恭喜你,注册成功!");
    }

}
