package com.leetcode;


public class CountAndSay {
    public static void main(String[] args) {
        int n = 6;
        int j = 0,i;
        int count =1;
        String[] result = new String[31];
        for (j = 0;j<result.length;j++) {               //字符串数组的初始化
            result[j] = "";
        }
        j = 0;
        result[0] = "1";
        result[1] = "11";
        for (i = 1;i<n;i++) {                       //遍历上一个字符串
            for (int m = j;m<result[i].length();) {
                int x = m;
                count =1;
                while (x < result[i].length()-1) {
                    if (result[i].charAt(x) == result[i].charAt(x+1)) {
                        count++;
                    }else {
                        break;
                    }
                    x++;
                }
                if (count > 1) {
                    result[i + 1] = result[i + 1] + count + "" + result[i].charAt(m);
                    m = m + count;
                } else {
                    result[i + 1] = result[i + 1] + "1" + result[i].charAt(m);
                    m++;
                }
            }
            j = 0;
        }
        System.out.println(result[i-1]);
    }
}
