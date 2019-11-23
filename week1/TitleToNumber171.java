package com.leetcode.week1;

public class TitleToNumber171 {
    public static void main(String[] args) {
        String s = "";
        int ans = 0;
        for (int i = 0;i<s.length();i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans*26 + num;
        }
        System.out.println(ans);
    }
}
