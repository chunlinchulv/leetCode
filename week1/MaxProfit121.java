package com.leetcode.week1;

public class MaxProfit121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int result = 0;
            for (int i = 0; i < prices.length - 1; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] - prices[i] >= result) {
                        result = prices[j] - prices[i];
                    }
                }
            }
            return result;
        }
    }
}
