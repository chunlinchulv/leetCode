package com.leetcode;

import java.util.Scanner;

public class max_same {
    public static void main(String[] args) {
        /**
         * 思路：
         * spilt分割
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String str = scanner.nextLine();
        //将字符串切割，存储在字符数组中
        String[] arr = str.split(",");
        String bas = arr[0];
        //找出最短的串
        for (int i = 0; i < arr.length; i++) {
            if (bas.length() > arr[i].length()) {
                bas = arr[i];
            }
        }
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<bas.length();j++) {

                if (bas.length() == 0) {
                    break;
                }
                if ( bas.charAt(j)!= arr[i].charAt(j)) {
                    bas = bas.substring(0,bas.length()-1);
                    j--;
                }

            }
        }
        if (bas.length() == 0) {
            System.out.println("");
        }else {
            System.out.println(bas);
        }
    }
}
