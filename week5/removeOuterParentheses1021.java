package com.leetcode.week5;

import java.util.Stack;

public class removeOuterParentheses1021 {
    public static void main(String[] args) {
        String S = "(()())(())(()(()))";
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start = 0;
        int end = 0;
        boolean flag = false;

        for (int i = 0;i<S.length();i++) {
            char ch = S.charAt(i);

            if (ch == '(') {
                stack.push(ch);
                if (flag == false) {
                    start = i;
                    flag = true;
                }
            }
            if (ch == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    stringBuilder.append(S.substring(start+1,end));
                    flag = false;
                    start = end;
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
