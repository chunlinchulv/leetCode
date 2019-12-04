package com.leetcode.week3;

public class fractionLCP2 {
    public static void main(String[] args) {
        int[] cont = {3, 2, 0, 2};
        int[] res = new int[2];
        res[0] = 1;
        res[1] = 0;
        for(int i = cont.length - 1; i >= 0; i--){
            int temp1 = res[1];
            res[1] = res[0];
            res[0] = cont[i] * res[1] + temp1;
        }
        for (int i = 0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
