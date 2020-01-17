package com.leetcode.week5;

import java.util.Arrays;

public class sortedSquares977 {
    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        for (int i = 0;i<A.length;i++) {
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        for (int i = 0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
    }
}
