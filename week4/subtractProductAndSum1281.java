package com.leetcode.week4;

public class subtractProductAndSum1281 {
    public static void main(String[] args) {
        int n = 234;
        int mul = 1;
        int add = 0;
        int temp = 0;
        while (n!=0) {
            temp = n%10;
            mul = mul*temp;
            add = add+temp;
            n = n/10;
        }
        System.out.println(mul-add);
    }
}
