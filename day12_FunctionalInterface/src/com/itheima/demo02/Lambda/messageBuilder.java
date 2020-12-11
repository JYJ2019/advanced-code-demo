package com.itheima.demo02.Lambda;

/**
 * @Description：MessageBuilder接口
 * @Author 金宇佳
 * @Date 2020/12/11 9:09
 * @Version 1.0
 */

@FunctionalInterface
public interface messageBuilder {
    //定义一个拼接消息的抽象方法,返回被拼接的消息
    public abstract String builderMessage();
}
