package com.leetcode.week4;

public class reverseWords557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] words = {""};
        StringBuilder result = new StringBuilder();
        words = s.split(" ");
        for (int i = 0;i<words.length;i++) {
            result = result.append(turnWords(words[i])+" ");
        }
        System.out.println(result.toString().trim());
    }

    private static String turnWords(String word) {
        char[] words = word.toCharArray();
        char temp;
        String a = "";
        for (int i = 0;i<word.length()/2;i++) {
            temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        for (int i = 0;i<words.length;i++) {
            a = a+words[i];
        }
        return a;
    }
}
