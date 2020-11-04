package com.sean.demo04.VarArgs;

public class Demo01VarArgs {

    public static void main(String[] args) {

        int sum = sum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    private static int sum(int... array) {

        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum;
    }
}
