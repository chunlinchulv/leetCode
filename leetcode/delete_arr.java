package com.leetcode;

public class delete_arr {
    public static void main(String[] args) {
        int[] nums ={1,1,2};
        int flag = 0;
        int x = nums.length;
        for (int i = 0;i<x;i++) {
            flag = nums[i];
            for (int j = i+1;j<x;j++) {
                if(flag == nums[j]) {       //如果元素重叠
                    for (int m =j;m<x-1;m++) {
                        nums[m] = nums[m+1];        //后面的元素覆盖前面的元素
                    }
                    x--;
                }
            }
        }
        System.out.println(x);
        for (int i = 0;i<x;i++) {
            System.out.print(nums[i]);
        }
    }

}
