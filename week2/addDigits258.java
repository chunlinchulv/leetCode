package com.leetcode.week2;

public class addDigits258 {
    public static void main(String[] args) {
        int num = 38,temp = 0;
        while (num >=10) {
            while (num != 0) {
                temp = temp + num % 10;
                num = num/10;
            }
            num = temp;
            temp = 0;
        }
        System.out.println(num);
    }
}
