package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * @Description：创建过滤器FileFilter的实现类,重写过滤方法accept,定义过滤规则
 * @Author 金宇佳
 * @Date 2020/12/2 15:43
 * @Version 1.0
 */

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /**
         * 过滤的规则：
         * 在 accept 方法中，判断 File 对象是否是以.java结尾
         * 是就返回 true
         * 不是就返回 false
         */
        if (pathname.isDirectory()) return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
