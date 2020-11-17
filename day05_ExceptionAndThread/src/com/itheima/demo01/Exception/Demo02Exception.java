package com.itheima.demo01.Exception;

/**
 * @Description：异常的产生过程解析
 * @Author 金宇佳
 * @Date 2020/11/16 11:32
 * @Version 1.0
 */
public class Demo02Exception {
    public static void main(String[] args) {
        //创建int类型的数组,并赋值
        int[] arr = {1, 2, 3};
        int ele = getElement(arr, 3);//ArrayIndexOutOfBoundsException
        System.out.println(ele);
    }

    /**
     * 获取数组指定索引处的元素
     * @param arr
     * @param index
     * @return
     */
    public static int getElement(int[] arr, int index) {
        return arr[index];
    }
}
