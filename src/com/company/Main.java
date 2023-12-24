package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


        public static void main(String[] args) {




                //  if(b>= 3*a){System.out.println("YES");}
                //  else System.out.println("NO");


                // System.out.println("Hello, World!");
//            int []arr = new int[]{2,3,7,2,5,7,9,7};
//            String str = "abc";
//            String out = "";
//            int[] n = new int[1];
//            int []ans = new int[1];

//            System.out.println(solve(str, out));
//            System.out.println(ans[0]);
//            String ans = "";
//            solve(n, ans);
//            System.out.println(n[0]-1);
//            }


//        public static int solve(String in, String out){
//            if(in.length() ==0) {
//                System.out.println(out);
//
//                return 1;
//            }
//            char ch = in.charAt(0);
//
//            int left = solve(in.substring(1), out+ch);
//            int right = solve(in.substring(1), out);
//            return left+right;
////            if(out.length()==0 || out.charAt(out.length()-1)!= 'H') solve(n-1,out+ch);
////            solve(n-1,out+ch1);
//        }


//        System.out.println("Hi this is again going to bang");
//        int [] rar = {3,4,12,43,32};
////        int [] arr = merger_Short(rar);
////        System.out.println(Arrays.toString(arr));
//        sort_bu_quickSort(rar,0,rar.length-1);
//        System.out.println(Arrays.toString(rar));
//    }

//            public static int[] merger_Short ( int[] arr){
//                int a = 0;
//                int b = arr.length;
//                int mid = a + (b - a) / 2;
//                int[] left = Arrays.copyOfRange(arr, 0, mid);
//                int[] right = Arrays.copyOfRange(arr, mid, arr.length);
//                return merge(left, right);
//            }
//
//            private static int[] merge ( int[] left, int[] right){
//                int i = 0, j = 0, k = 0;
//                int[] mix = new int[left.length + right.length];
//                while (i < left.length && j < right.length) {
//                    if (left[i] < right[j]) {
//                        mix[k] = left[i];
//                        i++;
//                    } else {
//                        mix[k] = right[j];
//                        j++;
//                    }
//                    k++;
//                }
//                while (j < right.length) {
//                    mix[k] = right[j];
//                    k++;
//                    j++;
//                }
//                while (j < left.length) {
//                    mix[k] = left[j];
//                    j++;
//                    k++;
//                }
//                return mix;
//            }
//
//            public static void sort_bu_quickSort ( int[] nums, int low, int high){
//                if (low >= high) {
//                    return;
//                }
//                int s = low;
//                int e = high;
//                int m = s + (e - s) / 2;
//                int pivot = nums[m];
//
//                while (s <= e) {
//                    while (nums[s] < pivot) {
//                        s++;
//                    }
//                    while (nums[e] > pivot) {
//                        e--;
//                    }
//                    if (s <= e) {
//                        int tmp = nums[s];
//                        nums[s] = nums[e];
//                        nums[e] = tmp;
//                        s++;
//                        e--;
//                    }
//
//                    sort_bu_quickSort(nums, low, e);
//                    sort_bu_quickSort(nums, s, high);
//                }
//            }

//            int [] arr = new int[]{0,1,3,5,6,8,12,17};
//            System.out.println(solve(arr));
//            isPrime(10,6);
//            isPrime(10,15);
//            a=6,b=15
//            int count=0;
//            for(int i = a; i<=b; i++){
//                if((isPrime(i,a)) || (isPrime(i,b))){
//                    count = count+1;
//                }
//            }
//            System.out.println(count);

//            Scanner sc = new Scanner(System.in);
//            int c = sc.nextInt();
//            String a = sc.next();
//            long n = Long.parseLong(a);
//            System.out.println(n);


//        }
//    public static boolean solve(int []arr){
//        if(arr.length <2) return true;
//
//        for(int i=1; i<arr.length; i++){
//            int a = Math.abs(arr[i+1]- arr[i]);
//            int b = Math.abs(arr[i] - arr[i-1]);
//            if(b == a+1 || b == a || b == a-1){
//                continue;
//            }else{
//                return false;
//            }
//        }return true;
//    }
//    public static void isPrime(long a, long b){
//        if (a == 1 || b == 1)
////            return true;
//        {
//            System.out.println(true);
//            return;
//        }
        // for(long i = 2; i * i <= a; i++)
        // {

        //     // If N has more than one
        //     // factor, then return false
        //     if (a % i == 0)
        //         return false;
        // }
//        int i = 2;
//        while(i<=Math.min(a,b)){
//            if(a%i==0 && b%i==0){
////                return false;
//                System.out.println(false);
//                return;
//            }
//            i++;
//        }

        // Otherwise, return true
//        return true;
//        System.out.println(true);
//        return;
//        }


//        String str = "abc";
//        String [] out = new String[1];
//        String [] list = new String[1000];
//        solve(str, "");
//        PrintLexoOrder(0, 1000);

//            int n = 4;
//            nQueens(1, n);

//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(3);
//            list.add(32);
//            System.out.println(list);

    PrintLexoOrder(0,100);

}

    static void breakLine()
    {
        System.out.print("\n---------------------------------\n");
    }
    static int MAX = 10;

    static int arr[] = new int[MAX], no;

    // Function to check queens placement
    static void nQueens(int k, int n)
    {

        for (int i = 1; i <= n; i++)
        {
            if (canPlace(k, i))
            {
                arr[k] = i;
                if (k == n)
                {
                    display(n);
                }
                else
                {
                    nQueens(k + 1, n);
                }
            }
        }
    }

    // Helper Function to check if queen can be placed
    static boolean canPlace(int k, int i)
    {
        for (int j = 1; j <= k - 1; j++)
        {
            if (arr[j] == i ||
                    (Math.abs(arr[j] - i) == Math.abs(j - k)))
            {
                return false;
            }
        }
        return true;
    }

    // Function to display placed queen
    static void display(int n)
    {
        breakLine();
        System.out.print("Arrangement No. " + ++no);
        breakLine();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (arr[i] != j)
                {
                    System.out.print("\t_");
                }
                else
                {
                    System.out.print("\tQ");
                }
            }
            System.out.println("");
        }

        breakLine();
    }



    public static void PrintLexoOrder(int curr, int n){
            if(curr>n){
                return;
            }
            System.out.println(curr);
            int i=0;
            if(curr == 0){
                i=1;
            }
            for (; i <= 9; i++) {
                PrintLexoOrder(curr*10+i, n);
            }
}

//public static void solve(String in, String out){
//
//        if(in.length() == 0){
//            System.out.println(out);
//            return;
//        }
//
//        for (int i = 0; i < in.length(); i++) {
//
//            char ch = in.charAt(0);
//            boolean b = true;
//            for (int j = 0; j < in.length(); j++) {
//                if(in.charAt(j) == ch){
//                    b = false;
//                    break;
//                }
//            }
//
//            if(b==true){solve(in.substring(0,i) + in.substring(i+1), out+ch);}
//
//
//        }
//
//
////        solve(in.substring(1), out );
//    }
}