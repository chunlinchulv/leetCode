package com.leetcode;

public class TheSameChar {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,6};
        boolean result = false;
        for(int i = 0;i<nums.length;i++) {
            if(result) {
                break;
            }
            for(int j =i+1;j<nums.length;j++) {
                if(nums[i] == nums[j]) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
