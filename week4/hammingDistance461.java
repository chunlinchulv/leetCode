package com.leetcode.week4;

public class hammingDistance461 {
    public static void main(String[] args) {
        int x = 1,y = 4;
        //完成两个数字的异或运算以后转为二进制数字，计算其中的1的个数
        int result = x^y;
        int count = 0;
        while (result != 0) {
            if (result%2 == 1) {
                count++;
            }
            result = result/2;
        }
        System.out.println(count);
    }

}
