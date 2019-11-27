package com.leetcode.week2;

public class reverseBits190 {
    public static void main(String[] args) {
        int n = 43261596;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if((n&1) == 1) {
                result = (result<<1) +1;
                n = n>>1;
            }else {
                result = result<<1;
                n = n>>1;
            }
        }
        System.out.println(result);
    }
}
