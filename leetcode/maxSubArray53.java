package com.leetcode;

public class maxSubArray53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = nums[0];
        int count = 0,m=0,j=0,i=0;
        for (i = 0;i<nums.length;i++) {
            for (j = i;j<nums.length;j++,m++) {
                count += nums[j];
                if (count >= result) {
                    result = count;
                }
            }
            count = 0;
        }
        System.out.println(result);
    }
}
