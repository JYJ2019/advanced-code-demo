package com.itheima.demo06.StaticMethodReference;

/**
 * @Description：定义一个抽象方法
 * @Author 金宇佳
 * @Date 2020/12/15 9:39
 * @Version 1.0
 */
@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法,传递一个整数,对整数进行绝对值计算并返回
    int calsAbs(int number);
}
