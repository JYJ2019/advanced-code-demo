package com.itheima.Test;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        /*
            1.准备牌操作
         */
        //1.1创建牌盒 将来储存牌面
        ArrayList<String> pokerBox = new ArrayList<>();
        //1.2创建花色集合
        ArrayList<String> colors = new ArrayList<>();

        //1.3创建数字集合
        ArrayList<String> number = new ArrayList<>();

        //1.4分别给花色 以及 数字集合添加元素
        colors.add("♥");
        colors.add("♠");
        colors.add("♦");
        colors.add("♣");

        for (int i = 2; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        //1.5 创造牌 拼接牌操作
        //拿出每一个花色 然后跟每一个数字 进行结合 储存到牌盒中
        for (String color : colors) {
            //color每一个花色
            //遍历数字集合
            for (String s : number) {
                //结合 储存到牌盒中
                pokerBox.add(color + s);
            }
        }
        //1.6大王小王
        pokerBox.add("大王");
        pokerBox.add("小王");

//        System.out.println(pokerBox);
        //洗牌 是不是就是将 牌盒中 牌的索引打乱
        //Collections类 工具类 都是 静态方法
        //shuffer方法
        /*
            static void shuffer(list<?> list)
                使用默认随机源对指定列表进行置换
         */
        //2.洗牌
        Collections.shuffle(pokerBox);
//        System.out.println(pokerBox);
        //发牌
        //3.1创建 三个 玩家集合 创建一个底牌集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

//        System.out.println(pokerBox.size());
        for (int i = 0; i < pokerBox.size(); i++) {
            //获取牌面
            String card = pokerBox.get(i);
            //留出三张底牌 存到 底牌合集中
            if (i >= 51) {
                dipai.add(card);
            } else {
                //玩家1   %3  ==0
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {//玩家2
                    player2.add(card);
                } else {//玩家3
                    player3.add(card);
                }
            }
        }

        //看看
        System.out.println("令狐冲" + player1);
        System.out.println("缇娜" + player2);
        System.out.println("录指" + player3);
        System.out.println("底牌" + dipai);
    }
}
