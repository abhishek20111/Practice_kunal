package com.company;

public class Dp_Class {
    public static void main(String[] args) {
        int [] wine = {2,3,5,1,4};
        Dp_Class obj = new Dp_Class();
//        int a = obj.solve(wine, 1, 0, 0);
//        System.out.println(a);
        int a = obj.Dp_Future(wine);
        System.out.println(a);
    }
    private int solve(int [] wine, int year, int i, int j){
        if(i>j){
            return 0;
        }

        int f = wine[i]*year + solve(wine, year+1, i+1, j);
        int l = wine[i]*year + solve(wine, year+1, i, j-1);
        return Math.max(f, l);
    }

    public int Dp_Future(int []wine){
        int [][]dp = new int[wine.length][wine.length];
        int year = wine.length;

        for(int i=0; i<dp.length; i++){
            dp[i][i] = wine[i]*year; //it fill digonal of all dp, and it multiply for 5 year
        }
        year--;
        for (int slide = 1; slide < dp.length; slide++) {
            for (int j = slide; j < dp.length; j++) {
                int i = j-slide;
                int f = wine[i]*year + dp[i+1][j];
                int l = wine[j]*year + dp[i][j-1];
                dp[i][j] = Math.max(f, l);
            }
            year--;
        }
        return dp[0][dp.length-1];
    }

//    remove
//    ignore
//    visited
//    self work
//    add niethgbours



}

