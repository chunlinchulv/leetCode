package com.leetcode.week3;

public class balancedStringSplit1221 {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        int num = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L')
                num++;
            else
                num--;
            if(num == 0)
                res++;
        }
        System.out.println(res);
    }
}
