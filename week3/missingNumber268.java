package com.leetcode.week3;

import java.util.Arrays;

public class missingNumber268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Arrays.sort(nums);
        int temp = 0,i = 0;
        while (temp <= nums[nums.length-1]) {
            if (temp == nums[i]) {
                i++;
            }else {
                break;
            }
            temp++;
        }
        System.out.println(temp);
    }
}
