package com.company;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class recursion_concept {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n = 1234;
//        reverse_digit(n);
//        System.out.println(sorted(arr,0));
//        System.out.println(Linear_search(arr,4,0));
//        System.out.println(find_position_of_target(arr,4,0,new ArrayList<Integer>()));
//        System.out.println(Searchs(arr,7,0, arr.length));

    }

    static int value = 0;
    public static void reverse_digit(int n){
        if (n==0){
            return ;
        }

        value = value*10 + n%10;
        System.out.println(value);
        reverse_digit(n/10);

     }

     public static boolean sorted(int [] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
     }

     static boolean Linear_search(int []arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[arr.length-1] != target){
            return false;
        }
        return arr[index] == target || Linear_search(arr, target, index+1);
     }

     static ArrayList<Integer> find_position_of_target(int []arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index+1);
        }
        return find_position_of_target(arr,target,index+1,list);
     }


     static int Search(int [] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }

        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target<=arr[m]){
                return Search(arr, target, s, m-1);
            }
            else {
                return Search(arr, target, m+1, e);
            }
        }

        if (target>=arr[m] && target<=arr[e]){

            return Search(arr, target, m+1, e);
        }
         return Search(arr, target, s, m-1);
     }

     static int Searchs(int [] arr, int target, int s, int e){
        if(s>=e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(arr[s]<=target && arr[m]>=target){
                return Searchs(arr, target, s, m-1);
            }
            else{
                return Searchs(arr, target, m+1, e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){

            return Searchs(arr, target, m+1, e);
            }

         return Searchs(arr, target, s, m-1);
     }






}
