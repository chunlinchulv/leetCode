package com.leetcode.week1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class merge88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        for (int i = 0;i<m+n;i++) {
            System.out.print(nums1[i] + "");
        }
    }
}
