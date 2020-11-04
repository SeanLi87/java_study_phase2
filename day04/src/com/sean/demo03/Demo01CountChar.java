package com.sean.demo03;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo01CountChar {
    public static void main(String[] args) {
        String str = "aaccdd";
        countChars(str);
        int[] a = {1,2,3};

    }

    private static void countChars(String str) {
        HashMap<Character,Integer> counter = new HashMap<>();
        char[] characterArrayList = str.toCharArray();
        for (char c:characterArrayList){
            if (counter.containsKey(c)){
                counter.put(c,counter.get(c)+1);
            }
            else {
                counter.put(c,1);
            }
        }

        for (char c:counter.keySet()){
            System.out.println(c+":"+counter.get(c));
        }
    }
}
