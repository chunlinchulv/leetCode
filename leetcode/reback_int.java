package com.leetcode;

import java.util.Scanner;

public class reback_int {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long last;
        long result = 0;
        while (num / 10 != 0) {
            last = num % 10;
            num = num / 10;
            result = result * 10 + last;
        }
        //对结果的处理
        result = (result * 10 + num);
        if(result<Integer.MIN_VALUE ||result>Integer.MAX_VALUE) {
            System.out.println(0);
        }else {
            System.out.println(result);
        }
    }
}
