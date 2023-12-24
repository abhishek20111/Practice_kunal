package com.company;
import java.util.*;

public class Dimpy2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a=0; a<n; a++){
            int s = sc.nextInt();
            int []arr = new int[s];
            for(int i =0;i<s;i++)arr[i]=sc.nextInt();
            int count=0;
            long final_res =0;
            boolean neg=true;
            for(int i=0;i<s;i++){
                if(arr[i]<0){
                    if(neg){
                        count++;
                        neg=false;
                    }
                    final_res+=(-1*arr[i]);
                }
                else if(arr[i]==0)final_res+=arr[i];
                else {
                    final_res+=arr[i];
                    neg=true;
                }
            }
            System.out.println(final_res +" "+count);
        }
    }}
