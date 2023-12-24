package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorting_ms_os {
//    public static void main(String[] args) {
//        int []arr = {2,1,4,12,4};
////        System.out.println(Arrays.toString(merge_sort(arr)));
//        sorts(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }

    public static int [] merge_sort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] l = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int [] r = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(l,r);
    }

    private static int[] merge(int[] l, int[] r) {
        int []mix = new int[l.length+r.length];
        int i=0,j=0,k=0;
        while (i<l.length && j<r.length){
            if(l[i]<r[j]){
                mix[k] = l[i];
                i++;
            }
            else{
                mix[k] = r[j];
                j++;
            }
            k++;
        }

        while(i<l.length){
            mix[k] = l[i];
            k++;
            i++;
        }
        while(j<r.length){
            mix[k] = r[j];
            k++;
            j++;
        }
        return mix;

    }

    public static int[] ms(int []arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = ms(Arrays.copyOfRange(arr,0,mid));
        int [] right = ms(Arrays.copyOfRange(arr,mid,arr.length));
        return merge_of_ms(left,right);
    }


    private static int [] merge_of_ms(int[] left, int[] right) {

        int i=0,j=0,k=0;
        int [] arr= new int[left.length+right.length];
        while (i<left.length && j<right.length){
            if (left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            arr[k]= left[i];
            i++;
            k++;
        }
        while (j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;

    }

//    //Sort method for merge short to reduce space
//    public static int [] merge_sort1(int [] arr,int s, int e){
//        if(e-s == arr.length)
//            return arr;
//        int mid = s+(e-s)/2;
//        merge_sort1(arr, s, mid);
//        merge_sort1(arr,mid,e);
//
//        mere_in_two(arr, s,mid,e);
//    }
//
//    private static int[] mere_in_two(int[] arr, int s, int mid, int e) {
//        int []mix = //same
//    }

    public static void sorts(int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while (s<=e){
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int tmp = nums[s];
                nums[s] = nums[e];
                nums[e] = tmp;
                s++;
                e--;

            }

            sorts(nums, low,e);
            sorts(nums, s,hi);

        }
    }


    public static void main(String[] args) {

    }
}

class AddDistance{
    int f1,i1,f2,i2;
    AddDistance(int f1, int i1, int f2, int i2){
        f1=this.f1;
        i1=this.i1;
        f2=this.f2;
        i1=this.i1;
    }
//    public void add(f1,i1,f2,i2){
//        System.out.println();
//    }
    public int feetToInch(int f, int i){
        return f*12 + i;
    }
    public int add(int a, int b){
        return a+b;
    }
    int [] result = new int[2];
    public void InchToFeet(int i){
        result[0] = i/12;
        result[1] = i%12;
    }
}
