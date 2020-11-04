package com.sean.demo04.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.sort;

public class PlayCards {

    public static void main(String[] args) {
        ArrayList<String> pokers = new ArrayList<>();
        String[] colors = new String[] {"♠️️","♥️","♦️","♣️"};
        String[] numbers = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
//        String[] specials = new String[] {"JOKER","joker"};
        pokers.add("大王");
        pokers.add("小王");
        //创建54张牌
        for (String color : colors) {
            for (String number : numbers) {
                pokers.add(color+number);
            }
        }
        //洗牌
        Collections.shuffle(pokers);
        //发牌
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();
        for (int i = 0; i < pokers.size(); i++) {

            String card = pokers.get(i);
            if (i >=pokers.size()-3){
                left.add(card);
            }else if (i%3==0){
                A.add(card);
            }else if (i%3==1){
                B.add(card);
            }else{
                C.add(card);
            }
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(left);
    }
}
