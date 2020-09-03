package com.itheima.Test;

/*
    System类
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //获取当前系统毫秒值时间
        long l = System.currentTimeMillis();
        System.out.println(l);

        //arraycopy(Object src,int srcPos,Object dest,int destPos,int length)复制数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        //将arr1数组中的前四个数字复制到arr2数组中
        System.arraycopy(arr1, 0, arr2, 0, 4);
        for (int value : arr2) {
            System.out.print(value + "  ");
        }
    }
}
