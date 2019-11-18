package com.leetcode.week1;
//牛顿迭代
public class MySqrt69test {
    public static void main(String[] args) {
        int num = 8;
        double k = 1;
        while (Math.abs(k*k-num)>1e-9) {                //精确度的控制9可以改成1，2，3，4，5...
            k = (k+num/k)/2;
        }
        System.out.println((int)k);
    }
}
