package com.sean.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
* list索引的常用方法
* add
* get
* remove
* set
*
* 操作索引的时候注意索引越界
* */
public class Demo01List {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add(1,"c");
        System.out.println(list);//[a, c, b]
        list.get(2);//c

        System.out.println(list.set(2, "d"));//替换了b
        System.out.println(list);//[a, c, d]

        System.out.println(list.remove("a"));//true
        System.out.println(list);//[c, d]

        System.out.println(list.remove(1));//d
        System.out.println(list);//[c]

        System.out.println("---------------");
        list.add("e");
        list.add("f");
        //for循环遍历list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------");
        //迭代器遍历

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------");
        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }

    }
}
