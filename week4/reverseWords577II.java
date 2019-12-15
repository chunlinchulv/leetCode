package com.leetcode.week4;

public class reverseWords577II {
    public static void main(String[] args) {
        String s =  "Let's take LeetCode contest";
        String words[] = s.split(" ");//用分隔符分开
        StringBuilder res=new StringBuilder();//StringBuilder
        for (String word: words)//遍历words
            res.append(new StringBuffer(word).reverse().toString() + " ");
        System.out.println(res.toString().trim());
    }
}
