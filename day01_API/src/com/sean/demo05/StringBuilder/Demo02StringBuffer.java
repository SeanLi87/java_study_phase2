package com.sean.demo05.StringBuilder;

public class Demo02StringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println("sb: "+sb);

        StringBuffer sb1 = new StringBuffer("abc");
        System.out.println(sb1);

        sb1.append("cba");
        System.out.println(sb1);

    }
}
