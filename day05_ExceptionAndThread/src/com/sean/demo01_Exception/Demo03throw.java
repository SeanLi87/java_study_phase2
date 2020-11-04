package com.sean.demo01_Exception;

public class Demo03throw {

    public static void main(String[] args) {

        int[] a = null;
        int result = method(a, 0);
        System.out.println(result);
    }

    private static int method(int[] array, int index) {

        if (array==null){
            throw new NullPointerException("数组为null");
        }

        return array[index];
    }


}
