package com.leetcode;

public class TheBestTime {
    /*public static void main(String[] args) {
        int[] prices = {6,1,3,2,4,7};
        int flag = -1;
        int min = prices[0];
        int num = 0;
        int sum = 0;
        int m =0;
        int i = 0,j = 0;
        for (i = 0;i<prices.length;i++) {
            if (prices[i] < min) {
                flag = i;                       //确认了最小值
                min = prices[i];
            }
        }
        for (i = 0; i < prices.length; i++) {
                for (j = flag;j<prices.length;j++) {
                    if((prices[j]-prices[flag])-num>0) {
                        num = prices[j]-prices[flag];
                    }
                }
                    sum += num;
                    num = 0;
                if(j == prices.length) {
                    break;
                }else {
                    i = j;                      //第二次寻找卖股票时间的起点
                    flag = i+1;
                }
        }
        System.out.println(sum);
    }*/
    public static void main(String[] args) {
        int[] nums = { 6,1,3,2,4,7 };
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int size = prices.length;
        for (int i = 0; i < size - 1; ++i)
            if (prices[i] < prices[i + 1])
                max += prices[i + 1] - prices[i];
        return max;
    }
}
