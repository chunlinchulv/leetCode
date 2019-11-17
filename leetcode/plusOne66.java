package com.leetcode;

public class plusOne66 {
    public static void main(String[] args) {
        int[] digits = {9};
        int temp = 0;
        for (int i = 0;i<digits.length/2;i++) {                     //将数组逆置
            temp = digits[i];
            digits[i] = digits[digits.length-1-i];
            digits[digits.length-1-i] = temp;
        }
        digits[0] = digits[0] + 1;
        for (int i = 0;i<digits.length-1;i++) {
            if (digits[i] >=10) {
                digits[i] = digits[i]%10;
                digits[i+1] = digits[i+1] +1;
            }
        }
        for (int i = 0;i<digits.length/2;i++) {                     //将数组逆置
            temp = digits[i];
            digits[i] = digits[digits.length-1-i];
            digits[digits.length-1-i] = temp;
        }
    }
}
