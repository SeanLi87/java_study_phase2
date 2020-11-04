package com.sean.demo03.System;

import java.util.Arrays;

public class Demo01System {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        int[] nums1 = new int[]{1,2,3,4};
        int[] nums2 = new int[]{5,6,7,8};
        System.arraycopy(nums1,0,nums2,0,3);
        System.out.println(Arrays.toString(nums2));

    }
}
