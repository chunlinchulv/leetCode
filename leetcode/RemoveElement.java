package com.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int n = nums.length;
        for(int i = 0;i<nums.length-1;i++) {
            if(nums[i] == val && nums[i+1] != val) {
                n--;
                for(int j = i;j<nums.length-1;j++) {
                    nums[j] = nums[j+1];
                }
            }else {
                for(int j = i;j<nums.length-1;j++) {
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        System.out.println(n);
    }
}
