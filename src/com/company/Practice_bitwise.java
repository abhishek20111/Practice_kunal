package com.company;

public class Practice_bitwise {




//    ??coount no of set bit
//    public static int set_bit(int n){
//        int count=0;
//        while(n>0){
//            count++;
//            n -= (n&-n);
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int num =23;
//        int [] arr= {0,1,2,3,4,5,6,7,8};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (set_bit(arr[i]))*1001+arr[i];
//        }
//
//        Arrays.sort(arr);
//        int i=0;
//        for (int a : arr) {
//            arr[i] = a%1001;
//            i++;
//        }
//        for (int a :
//                arr) {
//            System.out.println(a);
//        }
//    }



    public static void main(String[] args) {
        int n=3;
        System.out.println(magic_no(n));
    }
    // magic no program
    public static int magic_no(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int a =n&1;
            n = n>>1;
            ans += base*a;
            base*=5;
        }
        return ans;
    }

    //find no of digit in base



}

