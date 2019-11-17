package com.leetcode;

public class TheSingleChar {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int i=0;
        boolean flag = false;
        if(nums.length==1) {
            System.out.println(nums[0]);
            return;
        }
        for(i = 0;i<nums.length;i++) {
            for(int j = 0;j<nums.length;j++) {
                if(i == j) {
                    continue;
                }else {
                    if(nums[i]==nums[j]) {
                        flag = false;
                        break;
                    }else {
                        flag = true;
                    }
                }
            }
            if(flag) {
                break;
            }
        }
        System.out.println(nums[i]);
    }
}
