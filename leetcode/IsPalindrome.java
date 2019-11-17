package com.leetcode;

/**
 * 判断输入的数字是不是回文数
 */
public class IsPalindrome {
    public static void main(String[] args) {
        int x = 12321;
        String strv = String.valueOf(x);
        boolean b = true;
        for (int i = 0;i < strv.length()/ 2;i ++){
            if(strv.charAt(i) != strv.charAt(strv.length()- 1 - i)){
                b = false;
                break;
            }
        }
        if(b) {
            System.out.println(x + "是回文");
        }else{
            System.out.println(x + "不是回文");

        }
        /*int number = x;
        int i = 0;
        int n = 0;
        int flag = 0;
        int[] nums = new int[10];
        while(x/10 != 0) {
            nums[i] = x%10;
            x = x/10;
            n++;
            i++;
        }
        for (i = 0;i<n/2;i++) {
            if(nums[i] != nums[n-i-1]) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println(number+"是回文数\n");
        }else {
            System.out.println(number+"不是回文数\n");
        }*/
    }
}
