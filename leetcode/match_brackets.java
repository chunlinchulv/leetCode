package com.leetcode;

import com.list.stack;

import java.util.Scanner;
import java.util.Stack;

public class match_brackets {
    public static void main(String[] args) {
        System.out.println("请输入一串括号：");
        Scanner str = new Scanner(System.in);
        char[] brackets = str.nextLine().toCharArray();              //将输入的字符串转换为字符串数组
        Stack stack = new Stack();
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i] == '(' || brackets[i] == '{' || brackets[i] == '[') {
                stack.push(brackets[i]);                            //如果是左括号，就将左括号推入栈中
            } else if(stack.empty()) {
                stack.push(brackets[i]);
            }else if (brackets[i] == ')' && stack.peek().equals('(')) {
                stack.pop();
            } else if (brackets[i] == '}' && stack.peek().equals('{')) {
                stack.pop();
            } else if (brackets[i] == ']' && stack.peek().equals('[')) {
                stack.pop();
            } else {
                break;
            }
        }
        if (stack.empty()) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
