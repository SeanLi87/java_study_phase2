package com.sean.demo03.HashCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Demo01HashCode {

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.hashCode());//1625635731
        System.out.println(p1);//com.sean.demo03.HashCode.Person@60e53b93   “60e53b93”的十进制是1625635731

        System.out.println("=========");

        String s1 = new String("abc");
        String s2 = new String ("abc");
        String s3 = new String("");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(Arrays.toString("abc".getBytes()));

        System.out.println(p1.hashCode());

        HashSet<String> set = new HashSet<>();


    }
}
