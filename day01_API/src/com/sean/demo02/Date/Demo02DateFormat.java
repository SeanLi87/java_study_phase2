package com.sean.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String f1 = format.format(date);
        System.out.println(f1);

        Date parse = format.parse(f1);
    }
}
