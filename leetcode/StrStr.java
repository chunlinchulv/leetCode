package com.leetcode;

import java.util.regex.Pattern;

public class StrStr {
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        boolean flag = Pattern.matches(".*"+needle+".*",haystack);
        /*int flag = haystack.indexOf(needle);
        System.out.println(flag);*/
        if(flag == true) {
            System.out.println(2);
        }else {
            System.out.println(-1);
        }
    }
}
