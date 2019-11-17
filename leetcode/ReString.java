package com.leetcode;

public class ReString {
    public static void main(String[] args) {
        char[] s = {'h','i'};
        char ch;
        if(s.length%2 == 0) {         //偶数
            for (int i = 0;i<s.length/2;i++) {
                ch = s[i];
                s[i] = s[s.length-i-1];
                s[s.length-i-1] = ch;
            }
        }else {
            for (int i = 0;i<s.length/2;i++) {
                ch = s[i];
                s[i] = s[s.length-i-1];
                s[s.length-i-1] = ch;
            }
        }
        System.out.println(s);
    }

}
