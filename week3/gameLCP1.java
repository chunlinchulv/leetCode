package com.leetcode.week3;

public class gameLCP1 {
    public static void main(String[] args) {
        int[] guess = {1,2,3};
        int[] answer = {3,2,1};
        int count = 0;
        for (int i = 0;i<guess.length;i++) {
            if(guess[i] == answer[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
