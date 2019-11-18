package com.leetcode.week1;

public class AddBinary67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String temp = "";
        int x= 0;
        if (a.length()<b.length()) {                        //将第一个字符串设定为长的字符串
            temp = a;
            a = b;
            b = temp;
        }
        StringBuilder result = new StringBuilder();         //方便运用字符串的追加
        char[] b1 = a.toCharArray();                        //转成字符数组
        char[] b2 = b.toCharArray();
        int[] num1 = new int[a.length()];
        int[] num2 = new int[a.length()];
        for (int i = a.length()-1,j=0;i>=0;i--,j++) {        //转成int的同时逆置数组，方便运算
            num1[i] = b1[j]-'0';
        }
        for (int i = b2.length-1,j=0;i>=0;i--,j++) {
            num2[i] = b2[j]-'0';
        }
        for (int i = b.length();i<a.length();i++) {         //将短的数组补为和长的等长
            num2[i] = 0;
        }
        for (int i = 0;i<a.length()-1;i++) {
            num1[i] += num2[i];
            if (num1[i] >= 2) {
                num1[i+1] += num1[i]/2;
                num1[i] = num1[i]%2;
            }
            x = i+1;
        }
        num1[x] += num2[x];
        for (int i = a.length()-1;i>=0;i--) {
            if (num1[a.length()-1] >= 2) {
                result.append(num1[a.length()-1]/2);
                num1[a.length()-1] = num1[a.length()-1]%2;
                i++;
            }else {
                result.append(num1[i]);
            }
        }
        System.out.println(result.toString());
    }
}
