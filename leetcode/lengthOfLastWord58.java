package com.leetcode;

public class lengthOfLastWord58 {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] word = {""};
        int num = 0;
        word = s.trim().split(" ");             //运用分隔符将字符串分开
        String result = word[word.length-1];    //获取最后一个单词
        if (result.length() != 0) {
            System.out.println(result.length());
        }else {
            System.out.println(0);
        }
    }
}
