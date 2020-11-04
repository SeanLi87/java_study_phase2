package com.sean.demo02.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("找六");
        coll.add("田七");
        //迭代器是一个接口，它的对象的获取方式是通过Collection中的iterator方法调用返回一个当前Collection集合的迭代器对象
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String s : coll) {
            System.out.println(s);
        }



    }
}
