package com.sean.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合遍历的第二种方式：使用Entry对象遍历
 *
 * Map集合中的方法：
 *   Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的Set视图。
 *
 * 实现步骤：
 *   1.使用map中的entrySet()方法，将所有entry对象存储到set当中
 *   2.使用迭代器或者增强for循环，遍历set当中的entry对象
 *   3.使用entry对象中的getKey和getValue方法获取键值对
 * */
public class Demo03EntrySet {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("李晨1", 1);
        map.put("李晨2", 2);
        map.put("李晨3", 3);

        map.forEach((s, integer) -> System.out.println(s+integer));

        //使用map中的entrySet()方法，将所有entry对象存储到set当中
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //2使用迭代器或者增强for循环，遍历set当中的entry对象
        //2.1用迭代器
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            //3.使用entry对象中的getKey和getValue方法获取键值对
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "=" + value);
        }
        //2.2用增强for循环
        for (Map.Entry<String, Integer> next : entries) {
            //3.使用entry对象中的getKey和getValue方法获取键值对
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "=" + value);
        }
    }

}
