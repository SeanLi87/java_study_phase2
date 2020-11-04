package com.sean.demo08.ConvertToString;

public class Demo01ConvertToString {

    public static void main(String[] args) {
        //基本类型转换成String
        String str1 = 100+"";//方法1
        System.out.println(str1+200);//100200,一般使用这个方式，最简便

        String str2 = Integer.toString(100);//方法2
        System.out.println(str2+200);//100200

        String str3 = String.valueOf(100);//方法3
        System.out.println(str3+200);//100200

        //String转换成基本类型
        int in1 = Integer.parseInt("100");//推荐

        //底层先调用parseInt，再调用valueOf(Int i),然后再自动拆箱成int
        // 如果只是为了转成基本类型的化，过程繁琐，不推荐
        int int2 = Integer.valueOf("100");


    }
}
