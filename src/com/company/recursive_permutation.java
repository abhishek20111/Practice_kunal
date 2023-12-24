package com.company;

import java.util.ArrayList;

public class recursive_permutation {
    public static void main(String[] args) {
        permutation("","abc");
    }

    public static void permutation(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }

//    public static ArrayList<String> permutation_Array(String p,String up){
//
//    }

}
