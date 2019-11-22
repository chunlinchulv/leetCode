package com.leetcode.week1;

import java.util.regex.Pattern;

public class IsPalindrome125 {
    public static void main(String[] args) {
        String str = "0p".toLowerCase().replaceAll("[^0-9a-zA-Z]","");
        boolean result = true;
        for (int i = 0;i<str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                result = false;
                break;
            }
        }
//        System.out.println(result);
//        String str = "A manmana, a pla./?n, a ca!@#$^&*(nal: Panama ,: HHH mana";
//        String str2 = "sadkfhjqwebmbji";
//        String result = str2.replaceAll("^[0-9a-zA-Z]+$","");
//        String result2 = str.replaceAll("(man)+(a)","");
/*
        String phone = "17391773775";
        String pattern = "1[35789][0-9]{9}";//这个好有趣
        boolean isMatch = Pattern.matches(pattern,phone);
        System.out.println(phone + "是否是电话号码"+isMatch);*/
        //System.out.println(result2);// 1_n开头

    }
}
