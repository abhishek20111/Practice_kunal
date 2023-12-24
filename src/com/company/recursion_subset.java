package com.company;

import java.util.*;

public class recursion_subset {
    public static void main(String[] args) {
//        System.out.println(remove_a1("abccac"));
//        System.out.println(remove_apples("abc_applecacapp"));
//        subsets("","abc");
//        ArrayList<String> list = subset_array("","abc");
//        System.out.println(list);
        System.out.println(letterCombination("","12"));


    }
    public static void remove_a(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch=='a'){
            remove_a(p,up.substring(1));
        }
        else {
            remove_a(p+ch,up.substring(1));
        }
    }

    public static String remove_a1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return remove_a1(up.substring(1));
        }
        return ch+remove_a1(up.substring(1));
    }

    public static String remove_apple(String str){
        if(str.isEmpty()){
            return "";
        }
        if (str.startsWith("apple")){
            return remove_apple(str.substring(5));
        }
        else{
            return str.charAt(0) + remove_apple(str.substring(1));
        }
    }

    public static String remove_apples(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return remove_apples(str.substring(5));
        }
        else{
            return str.charAt(0)+remove_apples(str.substring(1));
        }
    }

    public static void subsets(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p+ch,up.substring(1));
        subsets(p,up.substring(1));
    }

    public static ArrayList<String> subset_array(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset_array(p+ch,up.substring(1));
        ArrayList<String> right = subset_array(p,up.substring(1));

        left.addAll(right);
        return left;
    }

//    public static List<List<Integer>> subset(int [] arr){
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for (int num : arr) {
//            int n = outer.size();
//            for (int i = 0; i < n; i++) {
//
//                List<Integer> integers = new ArrayList<>(outer.get(i));
//                integers.add(num);
//                outer.add(integers);
//            }
//        }
//    }
    public static ArrayList<String> letterCombination(String p, String up){
        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            list.addAll(letterCombination(p+ch,up.substring(1)));
        }
        return list;

    }

}
