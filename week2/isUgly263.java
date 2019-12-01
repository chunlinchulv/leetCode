package com.leetcode.week2;

public class isUgly263 {
    public static void main(String[] args) {
        int num = 14;
        boolean result = false;
        while (num != 1 && num != 0){
            if (num%2 == 0) {
                num = num/2;
                result = true;
            }else if (num%3 == 0) {
                num = num/3;
                result = true;
            }else if (num%5 == 0) {
                num = num/5;
                result = true;
            }else {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
