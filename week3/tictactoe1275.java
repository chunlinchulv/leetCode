package com.leetcode.week3;

public class tictactoe1275 {
    public static void main(String[] args) {
        int[][] moves = {{2,0},{0,2},{0,0},{2,2},{1,1},{1,0},{0,1}};
        int[][] game = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};//井字棋棋盘
        int count = 1;
        boolean flag = false,minus = false;
        for (int i = 0;i<moves.length;i++) {//A、B两方走棋
            if ((i+1)%2 != 0) {//为奇数  A走棋子
                game[moves[i][0]][moves[i][1]] = 1;
            }else{
                game[moves[i][0]][moves[i][1]] = 0;
            }
        }
        for (int i = 0;i<game.length;i++) {
            for (int j = 0;j<game.length;j++) {
                if (game[i][j] == -1) {
                    minus = true;
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                flag = false;
                break;
            }
        }
        for (int i = 0;i<game.length;i++) {
            for (int j = 0;j<game.length-1;j++) {
                if (game[i][j] == game[i][j+1]&&game[i][j]!=-1) {
                    count++;
                }else {
                    count = 1;
                    break;
                }
                if (count == 3) {
                    flag = true;
                    if (game[i][j] == 1) {
                        System.out.println("A");
                        return;
                    }else {
                        System.out.println("B");
                        return;
                    }
                }
            }
        }
        for (int j = 0;j<game.length;j++) {
             for (int i = 0;i<game.length-1;i++) {
                if (game[i][j] == game[i+1][j]&&game[i][j]!=-1) {
                    count++;
                }else {
                    count = 1;
                    break;
                }
                if (count == 3) {
                    flag = true;
                    if (game[i][j] == 1) {
                        System.out.println("A");
                        return;
                    }else {
                        System.out.println("B");
                        return;
                    }
                }
            }
        }
        if (game[0][0] == game[1][1] &&game[1][1] == game[2][2]&&game[0][0]!=-1) {
            flag = true;
            if (game[0][0] == 1) {
                System.out.println("A");
                return;
            }else {
                System.out.println("B");
                return;
            }
        }else if (game[0][2] == game[1][1] &&game[1][1] == game[2][0]&&game[0][2]!=-1){
            flag = true;
            if (game[0][2] == 1) {
                System.out.println("A");
                return;
            }else {
                System.out.println("B");
                return;
            }
        }
        if (flag == false && minus == false) {
            System.out.println("Draw");
            return;
        }else {
            System.out.println("Pending");
            return;
        }
    }
}
