package com.leetcode;

public class UniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int flag = 0;
        int j =0;
        boolean m = false;
        char[] str = s.toCharArray();
        //异常情况排除：字符串为空，返回-1
        if(str.length==0) {
            flag = -1;
        }
        //遍历开始
        for (int i = 0;i<str.length;i++) {
            flag = i;
            m = false;                                  //假设没有重叠
            for (j = 0;j<str.length;j++) {
                //遍历的自己时,跳过
                if(j==flag) {
                    continue;
                }else {
                    if(str[flag] == str[j]) {           //发现了与flag处重叠的元素
                        j=0;
                        m = true;                       //表示遇到了重叠，改变状态
                        break;                          //flag向前移动一位
                    }
                }
            }
           if(m==true&&i==str.length-1) {               //已经遍历到最后一位依旧重叠
               flag = -1;                               //
           }else if(m==false){
               break;                                   //没有遇到重叠，结束循环
           }
        }
        System.out.println(flag);
    }
}
