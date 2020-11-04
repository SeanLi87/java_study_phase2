package com.sean.demo02;

import java.lang.reflect.Array;
import java.util.*;

/*
* HashMap存储自定义类型键值
* key:person类型
*     person类就必须重写hashcode和equals方法，以保证key唯一
* value：无所谓
*
* */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();

    }

    private static void show02() {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("小王",18),"北京");
        map.put(new Person("小李",19),"上海");
        map.put(new Person("小明",12),"北京");
        map.put(new Person("小明",12),"成都");//将会覆盖上一个的值

        //使用keySet+迭代器循环键值对
        Set<Person> personSet = map.keySet();
        //迭代器循环
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()){
            Person key = iterator.next();
            String value = map.get(key);
            System.out.println(key+"----->"+value);
        }

        //使用entry+增强for循环键值对
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry:entries){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-------->"+value);
        }


    }
}
