package com.sean.demo05.StringBuilder;
/*
*
* */
public class Demo01StringBuilder {

    public static void main(String[] args) {

        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1);//空字符串

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:" +bu2);//bu2:abc

        StringBuilder bu3 = new StringBuilder();
        StringBuilder bu4 = bu3.append("abc");
        System.out.println("bu3:"+bu3);//bu4:abc
        System.out.println("bu4:"+bu4);//bu4:abc

        StringBuilder bu5 = new StringBuilder();
        bu5.append(1).append('a').append(1.1).append("ABC");
        System.out.println("bu5:"+bu5);

        String a = "abc";
        StringBuilder bu = new StringBuilder(a);
        String b = bu.toString();
        System.out.println(a.equals(b));

        System.out.println(a.length());
    }
}
