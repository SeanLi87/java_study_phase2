package com.sean.demo02.Date;

import java.util.Date;

public class Demo01Date {

    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);//Thu Aug 06 15:12:06 CST 2020 系统时间

        Date d2 = new Date(0L);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970 当前时区的0毫秒起点时间

        long time = d1.getTime();
        System.out.println(time);//等效于System.currentTimeMillis()

        System.out.println(System.currentTimeMillis());



    }
}
