package com.sean.demo07.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Demo01Doudizhu {

    public static void main(String[] args) {

        HashMap<Integer, String> cards = new HashMap<>();
        String[] colors = new String[]{"♠", "♥", "♦", "♣"};
        String[] numbers = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i <= 53; i++) {
            index.add(i);
        }
        //组装牌
        int n = 0;
        for (String number : numbers) {
            for (String color : colors) {
                cards.put(n++, color + number);
            }
        }

        cards.put(n++, "大王");
        cards.put(n++, "小王");
        //洗牌
        Collections.shuffle(index);
        //发牌
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();

        for (int i = 0; i < index.size(); i++) {
            if (i >= index.size() - 3) {
                left.add(index.get(i));
            } else if (i % 3 == 0) {
                p1.add(index.get(i));
            } else if (i % 3 == 1) {
                p2.add(index.get(i));
            } else {
                p3.add(index.get(i));

            }
        }

        //排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        //打印
        for (Integer integer : p1) {
            System.out.print(cards.get(integer) + " ");
        }
        System.out.println("");
        for (Integer integer : p2) {
            System.out.print(cards.get(integer) + " ");
        }
        System.out.println("");
        for (Integer integer : p3) {
            System.out.print(cards.get(integer) + " ");
        }
        System.out.println("");
        for (Integer integer : left) {
            System.out.print(cards.get(integer) + " ");
        }


    }
}
