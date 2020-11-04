package com.sean.demo03.Generic;

import java.util.Random;

public class Demo01Generic {

    public static void main(String[] args) {
        //创建一个泛型类,指定数据类型为String
        GenericClass<String> obj1 = new GenericClass<>();
        //方法参数类型是和类相同的泛型时，参数类型和对象指定类型一致
        obj1.method1("字符串");
        //方法返回值类型和类相同的泛型时，返回值类型和对象指定类型一致
        System.out.println(obj1.method2("又一个字符串"));
        //自定义泛型的方法，不需要创建对象时指定泛型，接收任意类型数据，返回
        System.out.println(obj1.method3(11));
        //未使用类泛型或者不含泛型的方法
        obj1.method4("123");

        obj1.method5();

        Random r = new Random();
        System.out.println(r.nextInt(1));

        System.out.println((0&0)==0);



    }
}
