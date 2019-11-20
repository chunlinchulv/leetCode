package com.leetcode.week1;

public class Mmerge88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2,5,6};
        int m = 3,n = 3;
        int p1 = m-1,p2 = n-1,p = m+n-1;
        while(p1>=0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            }else {
                nums1[p--] = nums2[p2--];
            }
        }
        while(p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
        for (int i = 0;i<m+n;i++) {
            System.out.print(nums1[i] + "");
        }
    }
}
