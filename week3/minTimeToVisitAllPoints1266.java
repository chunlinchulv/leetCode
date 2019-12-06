package com.leetcode.week3;

public class minTimeToVisitAllPoints1266 {
    public static void main(String[] args) {
        /**
         * 尝试失败
         */
        /*int[][] points = {{773, -917}, {-500, -910}};
        int count = 0;
        int yx = 0;
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i][0] == points[i + 1][0]) {//两个坐标的横坐标相等
                count = Math.abs(points[i][1] - points[i + 1][1]);//步数等于纵坐标相减
            } else if (points[i][1] == points[i + 1][1]) {//两个坐标的纵坐标相等
                count = Math.abs(points[i][0] - points[i + 1][0]);//步数等于横坐标相减
            } else {//横坐标和纵坐标都不相等
                if (Math.abs(points[i+1][0]-points[i][0]) < Math.abs(points[i+1][1]-points[i][1])) {
                    int x = points[i + 1][0] - points[i][0];//横坐标的差
                    if (points[i+1][1]>points[i][1]) {
                        yx = points[i][1] + Math.abs(x);//第一个纵坐标+横坐标的差
                    }else{
                        yx = points[i][1] - Math.abs(x);
                    }
                    count = count + Math.abs(x) + Math.abs(points[i + 1][1] - yx);//结果等于横坐标的差加上yx
                }else{
                    int x = points[i + 1][1] - points[i][1];//纵坐标的差
                    if (points[i+1][0] > points[i][0]) {
                        yx = points[i][0] + Math.abs(x);//第一个横坐标+纵坐标的差
                    }else {
                        yx = points[i][0] - Math.abs(x);
                    }
                    count = count + Math.abs(x) + Math.abs(points[i + 1][0] - yx);//结果等于横坐标的差加上yx
                }
            }
        }
        System.out.println(count);*/

        /**
         * 切比雪夫距离
         */
        int[][] points = {{773, -917}, {-500, -910}};
        int count = 0;
        for (int i = 0;i<points.length-1;i++) {
            int dx = Math.abs(points[i][0]-points[i+1][0]);
            int dy = Math.abs(points[i][1]-points[i+1][1]);
            count = count+Math.max(dx,dy);
        }
        System.out.println(count);
    }
}
