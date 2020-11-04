package com.sean.demo06.Integer;

public class Demo01Integer {

    public static void main(String[] args) {

        Integer in1 = new Integer(1);//java9中已过时
        System.out.println(in1);

        Integer in2 = Integer.valueOf(1);
        Integer in3 = Integer.valueOf("100");
        System.out.println(in2);
        System.out.println(in3);

        int in4 = in3.intValue();//拆箱
        System.out.println(in4);


        int in5 = in1;//自动拆箱
        in1 = in1 + 1; //先将in1自动拆箱成整型，然后+1之后再自动装箱(重新new一个包装类）赋值给in1




    }
}
