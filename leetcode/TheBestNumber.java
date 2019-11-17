package com.leetcode;

import java.util.Scanner;

public class TheBestNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int m = 0;
        int count = 0;
        int x= SC.nextInt();
        int max = (int)Math.pow(10,x)-1;
        for(int i =1;i<=max;i++) {
            m = i;
             do{
                count = count + (int)Math.pow(m%10,5);
                m = m/10;
            }while(m%10>0);
            if(count == i||i==1) {
                System.out.println(i);
            }
            m=0;
            count = 0;
        }
    }
}
