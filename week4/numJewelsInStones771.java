package com.leetcode.week4;

public class numJewelsInStones771 {
    public static void main(String[] args) {
        int ans = 0;
        String S = "aAAbbbb";
        String J = "aA";
        for (char s: S.toCharArray()) // For each stone...
            for (char j: J.toCharArray()) // For each jewel...
                if (j == s) {  // If the stone is a jewel...
                    ans++;
                    break; // Stop searching whether this stone 's' is a jewel
                }
        System.out.println(ans);
    }
}
