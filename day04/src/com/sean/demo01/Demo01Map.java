package com.sean.demo01;

import java.util.HashMap;
import java.util.Map;
/*
* map的四种常用方法
* 1. map.put(k,v); k若存在，返回被替换的值; k若不存在，返回为null(因为map中基本类型都会用包装类，因此都是返回null作为初始值）
* 2. map.remove(k);k若存在，返回被删除的值; k若不存在，返回null
* 3. ma.get(k); k若存在，返回对应的值; k若不存在，返回null
* 4. map.containsKey(k); 若k存在，返回布尔值true： 若K不存在返回false
* */
public class Demo01Map {

    public static void main(String[] args) {


        putMethod();
        HashMap<String,String> map = new HashMap<>();
//        removeMethod();
//        getMethod();
//        containsKeyMethod();
    }

    private static void containsKeyMethod() {
        Map<String,Integer> map = new HashMap<>();
        map.put("李晨1",1);
        map.put("李晨2",2);
        map.put("李晨3",3);
        boolean b1 = map.containsKey("李晨1");
        System.out.println(b1);
        boolean b2 = map.containsKey("李晨");
        System.out.println(b2);

    }

    private static void getMethod() {
        Map<String,Integer> map = new HashMap<>();
        map.put("李晨1",1);
        map.put("李晨2",2);
        map.put("李晨3",3);
        Integer getResult1 = map.get("李晨2");
        System.out.println(getResult1); //2

        Integer getResult2 = map.get("李晨5");
        System.out.println(getResult2); //null

    }

    private static void removeMethod() {
        Map<String,Integer> map = new HashMap<>();
        map.put("李晨1",1);
        map.put("李晨2",2);
        map.put("李晨3",3);
        Integer removed1 = map.remove("李晨2");
        System.out.println(removed1);
//        int removed = map.remove("李晨2");//当k不存在时，返回null会导致自动拆箱出现空指针异常，因此建议返回值类型为包装类
        Integer removed2 = map.remove("李晨5");
        System.out.println(removed2); //null
    }

    private static void putMethod() {
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("李晨","范冰冰1");
        System.out.println("v1:"+v1);//v1:null,因为第一次替换的时候v1的value为null

        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v2:" + v2);//v2:范冰冰1
        System.out.println(map);//{李晨=范冰冰2}

        String v3 = map.put("杨过","小龙女");
        String v4 = map.put("尹志平","小龙女");//value可以重复
        System.out.println(map);

        Map<Integer,Integer> map1 = new HashMap<>();
        Integer put = map1.put(1, 2);
        Integer put2 = map1.put(1, 2);
        System.out.println(put2);
        for (String s : map.keySet()) {
            System.out.println(s);
        }


    }



}
