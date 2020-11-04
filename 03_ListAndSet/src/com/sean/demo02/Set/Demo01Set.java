package com.sean.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(3);
        //使用迭代器循环
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用增强for循环
        for (Integer integer : set) {
            System.out.println(integer);
        }

        int[] i = new int[]{1};
        System.out.println(i);
        System.out.println(i.hashCode());




    }
}
