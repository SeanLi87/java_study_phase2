package com.sean.demo06_Thread;

import java.util.HashMap;
import java.util.HashSet;

public class Demo01Thread {

    public static void main(String[] args) {

//        MyThread th = new MyThread();
//        th.start();
//        for (int i = 0; i < 20; i++) {
//            System.out.println("main:"+i);
//        }

        System.out.println(5&95);
        System.out.println(5&96);
        System.out.println(5&97);
        System.out.println(5&98);
        System.out.println(5&99);

        System.out.println(Integer.toBinaryString("0".hashCode()));
        System.out.println(Integer.toBinaryString("1".hashCode()));
        System.out.println(Integer.toBinaryString("2".hashCode()));
        System.out.println("=============");
        System.out.println(95%6);
        System.out.println(96%6);
        System.out.println(97%6);
        System.out.println(98%6);
        System.out.println(99%6);

        int[] nums = new int[12];
        System.out.println(nums.length);
    }
}
