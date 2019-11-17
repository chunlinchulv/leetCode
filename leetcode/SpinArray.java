package com.leetcode;

public class SpinArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k =0;
        int m =0;
        for (int i = 0;i<k;i++) {
            for (int j =nums.length-1;j>=0;j--) {
                if(j == nums.length-1) {
                    m = nums[j];
                }
                if(j == 0) {
                    nums[0] = m;
                }else {
                    nums[j] = nums[j - 1];
                }
            }
        }
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
