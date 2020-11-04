package com.sean.demo01_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {//编译期异常处理方式：抛出异常
        //编译期异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        //编译期异常处理方式：try catch异常
        try {
            date = sdf.parse("1999-1111");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //运行期异常
        int[] int1 = new int[]{1, 2, 3};
        try {

            System.out.println(int1[3]);//ArrayIndexOutOfBoundsException
        }catch (Exception e){
            System.out.println("出现了越界："+e);
            e.printStackTrace();
        }finally {
            System.out.println("资源施放");
        }

        //ERROR
//        int[] in = new int[1024*1024*1024];
        System.out.println("后序代码执行");

    }
}
