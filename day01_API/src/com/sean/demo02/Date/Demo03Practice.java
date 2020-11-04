package com.sean.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Demo03Practice {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        String birthday = sc.next();
        long currentDate = System.currentTimeMillis();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = f.parse(birthday);
        long birthdayMill = parse.getTime();
        long dif = currentDate-birthdayMill;
        long ageDays = dif / (24*60*60*1000);
        System.out.println(ageDays);




    }
}
