package com.sean.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合的第一种遍历方式：通过【键找值】
* Map集合中的方法：
*   Set<K> keySet() 返回此映射中包含的键的set视图
* 实现步骤：
*   1.使用Map集合中的方法keySet(),把map集合中的key取出来
*   2.使用迭代器或者增强for循环来循环key
*   3.通过map中的get(K)方法来获取对应值
* */
public class Demo02KeySet {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("李晨1",1);
        map.put("李晨2",2);
        map.put("李晨3",3);
        Set<String> keys = map.keySet();

        //使用迭代器循环set
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

        for (String key: keys){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
