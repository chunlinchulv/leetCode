package com.leetcode.week2;

public class trailingZeroes172 {
    public static void main(String[] args) {
        int n = 13,result = 0;                  //n比较大时就会超过限制数字大小，求阶乘的方法不可取
        while(n > 0) {
            result = result + n/5;
            n = n/5;
        }
        System.out.println(result);
    }
}
