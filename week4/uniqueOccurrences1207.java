package com.leetcode.week4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueOccurrences1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        //记录出现的次数
        for (int data :arr){
            if (map.get(data) == null) {
                map.put(data,1);
            }else {
                map.put(data,map.get(data)+1);
            }
        }

        //检验重复的值
        for (Integer i:map.values()) {
            if (!set.add(i)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
