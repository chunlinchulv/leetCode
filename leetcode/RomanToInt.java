package com.leetcode;

import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        String roman = scanner.nextLine();              //输入罗马字符*/
        String roman = "MDCXCV";
        char[] romanChar = roman.toCharArray();         //将罗马字符分开存储在字符数组中
        for (int i = 0; i < romanChar.length; i++) {
            if (romanChar[i] == 'I'&&(i<romanChar.length-1)) {
                if (romanChar[i + 1] == 'V') {
                    romanChar[i] = 0;
                    romanChar[i + 1] = 4;
                    i++;
                } else if (romanChar[i + 1] == 'X') {
                    romanChar[i] = 0;
                    romanChar[i + 1] = 9;
                    i++;
                } else {
                    romanChar[i] = 1;
                }
            } else if (romanChar[i] == 'X'&&(i<romanChar.length-1)) {
                if (romanChar[i + 1] == 'L') {
                    romanChar[i] = 0;
                    romanChar[i + 1] = 40;
                    i++;
                } else if (romanChar[i + 1] == 'C') {
                    romanChar[i] = 0;
                    romanChar[i + 1] = 90;
                    i++;
                } else {
                    romanChar[i] = 10;
                }
            }else if(romanChar[i] == 'C'&&(i<romanChar.length-1)) {
                if (romanChar[i + 1] == 'D') {
                    romanChar[i] = 0;
                    romanChar[i + 1] = 400;
                    i++;
                } else if (romanChar[i + 1] == 'M') {
                    romanChar[i] = 0;
                    romanChar[i + 1] = 900;
                    i++;
                } else {
                    romanChar[i] = 100;
                }
            }else if(romanChar[i] == 'I') {
                romanChar[i] = 1;
            }else if(romanChar[i] == 'V') {
                romanChar[i] = 5;
            }else if(romanChar[i] == 'X') {
                romanChar[i] = 10;
            }else if(romanChar[i] == 'L') {
                romanChar[i] = 50;
            }else if(romanChar[i] == 'C') {
                romanChar[i] = 100;
            }else if(romanChar[i] == 'D') {
                romanChar[i] = 500;
            }else if(romanChar[i] == 'M') {
                romanChar[i] = 1000;
            }
        }
        int result = 0;
        int[] nums = new int[30];
        for (int i = 0;i<romanChar.length;i++) {
            nums[i] = Character.valueOf(romanChar[i]);
            result += nums[i];
        }
        System.out.println(result);
    }
}

