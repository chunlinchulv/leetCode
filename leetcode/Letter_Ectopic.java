package com.leetcode;

/**
 * 字母异位词
 *
 * 排除单词长度不相等的组合
 * 排除单词长度相等，但两个单词的字母不重叠的组合
 */
public class Letter_Ectopic {
    public static boolean main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        int[] alphabet = new int[26];
        for(int i = 0;i<s.length();i++) {
            alphabet[s.charAt(i)-'a']++;
        }
        for (int j = 0;j<t.length();j++) {
            alphabet[t.charAt(j)-'a']--;
        }
        for(int i:alphabet) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
