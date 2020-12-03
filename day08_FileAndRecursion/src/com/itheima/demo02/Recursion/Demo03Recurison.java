package com.itheima.demo02.Recursion;

/**
 * @Description：使用递归计算阶乘
 * @Author 金宇佳
 * @Date 2020/12/2 11:07
 * @Version 1.0
 */

/*
    练习:
        使用递归计算阶乘
        n的阶乘：n! = n * (n-1) * ...* 3 * 2 * 1
        5的阶乘：5! = 5 * (5-1) * (5-2) * (5-3) * (5-4)
 */
public class Demo03Recurison {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    /**
     * 定义方法使用递归计算阶乘
     * 5的阶乘：5! = 5 * (5-1) * (5-2) * (5-3) * (5-4) = 5 * 4 * 3 * 2 * 1
     * 递归结束的条件
     *     获取到1的时候结束
     * 递归的目的
     *      获取下ー个被乘的数字（n-1)
     * 方法的参数发生变化
     *     5,4,3,2,1
     * @param i
     * @return
     */
    private static int factorial(int i) {
        //获取到1的时候结束
        if (i == 1) {
            return 1;
        }
        //获取下一个被乘的数字(n-1)
        return i * factorial(i - 1);
    }
}
