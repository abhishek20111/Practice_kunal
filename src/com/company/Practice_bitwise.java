package com.company;

import javax.swing.plaf.nimbus.State;
import java.util.*;

class a{
    int b;
    a(int b){
        b = b;
    }
    void m1(){
        System.out.println("m1");
    }

}
//class b extends a{
//    void m1(){
//        System.out.println( "b classs m1");
//    }
//    void m2(){
//        System.out.println("m2");
//    }
//}
//
//public class Practice_bitwise {
//
//    public static void main(String[] args) {
//        a obj = new b();
//        obj.m1();
//
//    }
//}




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



//    public static void main(String[] args) {






//        int n=3;
//        System.out.println(magic_no(n));
//        two_power(16);

    // magic no program
//    public static int magic_no(int n){
//        int ans = 0;
//        int base = 5;
//        while(n>0){
//            int a =n&1;
//            n = n>>1;
//            ans += base*a;
//            base*=5;
//        }
//        return ans;
//    }

    //find power of 2 or not
//    public static void two_power(int n){
//        int count =0;
//        while(n>0){
//
//            count+=1;
//            n = n>>1;
//
//        }
//        if(count>1){
//            System.out.println("not power of 2");
//        }else
//            System.out.println("power of 2");



class Practice_bitwise{
    //    public static void main(String[] args) {
//        int n=5;
//        int z=n;
//        for(int i=0; i<n; i++){
////            for()
//        }
//    }
    public static void main(String[] args) {
//    int [] arr = new int[]{2,3,5,6};
//    boolean [] ar = new boolean[arr.length];
//    solve(arr,"", 10);

//    String str = "nitin";
//    solve(str, "");
//        solve_queen_1D(0, 4, 2, "");
//    int [][] arr =new int[3][3];
//    solve_n_queen(2, 0, 0, arr, "");

//    N_Queen(0, 0, 4, "", 4, 4, new boolean[4][4]);
//    char[][] board = {{'5','3','.','.','7','.','.','.','.'},
//            {'6','.','.','1','9','5','.','.','.'},
//            {'.','9','8','.','.','.','.','6','.'}
//            ,{'8','.','.','.','6','.','.','.','3'},
//            {'4','.','.','8','.','3','.','.','1'},
//            {'7','.','.','.','2','.','.','.','6'},
//            {'.','6','.','.','.','.','2','8','.'},
//            {'.','.','.','4','1','9','.','.','5'},
//            {'.','.','.','.','8','.','.','7','9'}};
//    System.out.println(solve_suduku(board));


//    --------------------------------------------------------------- for quick sort
//    int []arr= new int[]{5,7,2,3,8,1,4};
//    quick_rec(arr,0, arr.length-1);
//    System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);

//    ---------------------Sliding window----------------------------
//    int [] arr= new int[]{1,2,3,4,5,6};
//    int k=3;
//    solve_sliding_max(arr, k);


//    -----------------------------------------------Sieve Enhancement algo-----------------

//    sieve_Algo_Prime(6);


//    -------------------------------------------------------Longest_different_substrinng
//    String s = "abba";
//    int left = 0;
//    int right = 0;
//    int len =0;
//    HashMap<Character, Integer> mm = new HashMap<>();
//    while(right<s.length()){
//        if(mm.containsKey(s.charAt(right))){
//            left = Math.max(mm.get(s.charAt(right))+1, left);
//        }
//        len = Math.max(len, right - left +1);
//        mm.put(s.charAt(right), right);
//        right++;
//    }
//    System.out.println(len);


//-----------------------------------------------------------------------------------------------


//    int[] arr= {11,2,3,23,13,9,15};
//    next_greater_element(arr);
//    int[] arr= {91,11,13,15,38,42,37};
//    stock_span(arr);

//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        lastvalue(st);
//        System.out.println(st);


//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//        System.out.println(n);
//
//        Stack<Integer> st1 = new Stack<Integer>();
//        Stack<Integer> st2 = new Stack<Integer>();
//        for(int i=0; i<n; i++){
//            st1.push(i);
//
//        }
//        while(!st1.isEmpty()){
//            int temp = st1.pop();
//            st2.push(temp);
//        }
//         while(!st2.isEmpty()){
//             int x = st2.pop();
//         	System.out.print(x+" ");
//         }

//        Scanner s = new Scanner(System.in);
//        String str = s.next();
//        Main mainobj = new Main();
//        Stack<Character> stack = new Stack<>();
//        if (isBalanced(str, stack)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    int [] nums=new  int []{2,3,7,5,10};
//
//        long []ans= new long[nums.length];
//        int max1 = 0;
//        int sum_prev=0;
//        for(int i=0; i<nums.length; i++){
//            int prev = nums[i] +Math.max(max1, nums[i]);
//            sum_prev += prev;
//            ans[i] = sum_prev ;
//            System.out.println(ans[i]);
//        }
//        int [] nums = new int[]{62,100,4};
//        int k =2;
//        Arrays.sort(nums);
//        int[] ans=new int[nums.length];
//        int min=0;
//        int c=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(i!=j){
//                    int diff=Math.abs(nums[i]-nums[j]);
//                    ans[c++]=diff;
//                }
//
//            }

            //min=Math.min(min,diff);
//        }
        //ans[ans.length-1]=nums[ans.length-1]-nums[0];
//        Arrays.sort(ans);
//        System.out.println(ans[k-1]);








//        ---------------------------------------------------------------


    }
    public static void display_(int[][]amaze){
        for(int i = 0 ; i<amaze.length ; i++){
            for(int j = 0; j<amaze[0].length; j++){
                System.out.print(amaze[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void Solve_Matrix(int [][]arr, int r, int c, int [][]ans, boolean sucess){

        int []row ={1,-1,0,0};
        int []col ={0,0,1,-1};
        if(r>arr.length || c>arr[0].length || arr[r][c] == 'X')return;
        if(r==arr.length-1 && c == arr[0].length-1){
            display_(ans);
            return;
        }
        if(sucess) {
            arr[r][c] = 'x';
            ans[r][c] = 1;

            for (int i = 0; i < row.length; i++) {
                Solve_Matrix(arr, r + row[i], c + col[i], ans, sucess);
            }
            arr[r][c] = 'O';
            ans[r][c] = 0;
        }

    }



    public static void solve(int[]arr, int t, Stack<Integer> st1, Stack<Integer> st2 ){

        for(int i=t-1; i>=0; i--){
            int value = arr[i];
            if(is_Prime(value)){
                st1.push(value);
            }else{
                st2.push(value);
            }
        }

        while(!st2.isEmpty()){
            System.out.println(st2.pop());
        }
        while(!st1.isEmpty()){
            System.out.println(st1.pop());
        }
    }

    public static boolean is_Prime(int n){

        if(n == 0 || n==1) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void stock_span(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }

    public static void insert(Stack<Integer> st, int n) {
        if (st.isEmpty()) {
            st.push(n);
            return;
        }
        int item = st.pop();
        insert(st, n);
        st.push(item);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int item = st.pop();
        reverse(st);
        insertdown(st, item);


    }
    	public static void insertdown(Stack<Integer> st,int n) {
		if(st.isEmpty()) {
			st.push(n);
			return;
		}
		int item =st.pop();
		insertdown(st,n);
		st.push(item);
}


    public static int lastvalue(Stack<Integer> st) {
		if(st.size()==1) {
			return st.peek();
		}
		int item = st.pop();
		int x=lastvalue(st);
		st.push(item);
		return x;
        }



        public static void next_greater_element(int[] arr) {
        int[] ans=new int[arr.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            ans[st.pop()]=-1;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(ans[i]+" ");
        }
}



private static void sieve_Algo_Prime(int n){
    boolean [] prime = new boolean[n+1];
    Arrays.fill(prime, false);

    for(int i=2; i*i<=n ;i++){
        if(!prime[i]){
            for (int j = i*i; j <=n; j+=i) {
                prime[j] = true;
            }
        }
    }
    for (int i = 2; i < n; i++) {
        if (!prime[i]) System.out.print(i+" ");
    }
}



private static void solve_sliding_max(int[] arr, int k) {
    int max_sum = 0, sum=0;
    int i=0,j=0;
    while (j< arr.length){
        sum += arr[j];
        if(j-i+1<k){
            j++;
        }else if(j-i+1==k){
            max_sum = Math.max(max_sum, sum);
            sum -= arr[i];
            i++;
            j++;
        }
    }
    System.out.println(max_sum);

}

    private static void quick_rec(int [] arr, int s, int e){
    if(s>=e){
        return;
    }
    int p = quick_sort(arr, s, e);
    quick_sort(arr,s, p-1);
    quick_sort(arr, p+1, e);
}

public static int quick_sort(int []arr, int s, int e){
    int tar = arr[e];
    int j=s-1;
    for(int i=s; i<=e-1; i++){
        if(arr[i] < tar){
            j++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
    int temp = arr[e];
    arr[e] = arr[j+1];
    arr[j+1] = temp;
    return j+1;
}




    public static void display(int[][] grid) {
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid.length;j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static boolean solve_suduku(char[][] b){
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if(b[i][j] == '.'){
                for (char k ='1'; k <= '9'; k++) {
                    if(is_valid_solve_suduku(b ,i, j, k)){
                        b[i][j] = k;
                        if(solve_suduku(b))return true;
                        b[i][j] = '.';
                    }
                }
                return false;
            }
        }
    }return true;
}



public static boolean is_valid_solve_suduku(char[][] b, int row, int col, char k){
    for(int i=0; i<9; i++){
        if(b[i][col] == k)return false;
        if(b[row][i] == k)return false;
        if(b[3*(row/3)+i/3][3*(col/3)+i%3]==k) return false;
    }
    return true;
}

public static void printPath(boolean [][] board){
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if(board[i][j]){
                System.out.print("Q");
            }else
                System.out.print("_");
        }
        System.out.println();
    }
    System.out.println();
}

private static void N_Queen(int r, int c, int qtq, String path, int totr, int totc, boolean [][] board){
    if(qtq == 0){
        printPath(board);
        return;
    }

    if(c==totc) {
        c=0;
        r++;
    }

    if(r==totr)return;

    if(isSafe_NQueen(r, c, board)){
        board[r][c] = true;

        N_Queen(r, c + 1, qtq - 1, path + "q{" + r + "," + c + "}", totr, totc, board);
        board[r][c] = false;
    }
    N_Queen(r, c+1, qtq, path, totr, totc, board);
}

private static boolean isSafe_NQueen(int r, int c, boolean[][] board) {
    for (int i = r; i >=0 ; i--) {
        if(board[i][c]) return false;
    }
    for (int i = 0; i <c ; i++) {
        if(board[r][i]) return false;
    }

    int r1 = r;
    int c1 = c;
    while (r1 >= 0 && c1 >= 0){
        if(board[r1][c1]) return false;
        r1--;
        c1--;
    }

    int r2 = r;
    int c2 = c;
    while (r2 >= 0 && c2<board[0].length){
        if(board[r2][c2]) return false;
        r2--;
        c2++;
    }
    return true;
}







//public static void solve_queen_1D(int col, int tot_col, int queen, String path){
//    if(queen==0){
//        System.out.println(path);
//        return;
//    }
//    if(col == tot_col){
//        return;
//    }
//
//    solve(col+1, tot_col, queen-1, path +" q-"+queen+"->col-"+col+" ");
//    solve(col+1, tot_col, queen, path);
//
//}

//    private static void solve(String in, String out) {
//        if(in.length() == 0){
//            System.out.println(out+" ");
//            return;
//        }
//
//        for (int i = 1; i <= in.length(); i++) {
//            String s = in.substring(0, i);
//            if(is_palindrome(s)) solve(in.substring(i), out+ s +" ");
//        }
//    }

//    private static boolean is_palindrome(String str){
//        for(int i=0; i<str.length()/2; i++){
//            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
//        }
//        return true;
//    }


//    public static void solve(int [] arr, String out, int n){
//        if(n == 0){
//            System.out.println(out);
//            return;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(n-arr[i]>=0) solve(arr,out+arr[i], n- arr[i]);
//        }
//    }


}








