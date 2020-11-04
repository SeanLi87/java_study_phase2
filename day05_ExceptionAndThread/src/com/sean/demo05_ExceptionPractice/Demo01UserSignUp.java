package com.sean.demo05_ExceptionPractice;

import java.util.HashSet;
import java.util.Scanner;

public class Demo01UserSignUp {

    private static HashSet<String> userList = new HashSet<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        userList.add("小明");
        try{
            System.out.println("请输入用户名：");
            signUp(sc.next());
        }catch (UserDuplicatedException e){
            System.out.println(e);
        }
    }

    public static void signUp(String userName){

        if (userList.add(userName)){
            System.out.println("注册成功");
        }else {
            throw new UserDuplicatedException("用户名已存在，注册失败");
        }
    }
}
