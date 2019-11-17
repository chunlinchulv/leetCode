package com.leetcode;

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 4;
        int result = 0;
        for (int i = 0;i<nums.length;i++) {
            if (target == nums[i]) {
                result = i;
                System.out.println(result);
                return;
            }
        }
        for (int i = 0;i<nums.length;i++) {
            if(target > nums[i]) {
                result = i+1;
            }
        }
        System.out.println(result);
    }
}
