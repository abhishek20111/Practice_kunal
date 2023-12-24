package com.company;

import java.util.Stack;

public class Recursion_by_aditya {
    public static void main(String[] args) {
        Stack<Character> st =
                new Stack<Character>();

        // push elements into the stack
        st.push('1');
        st.push('2');
        st.push('4');
        st.push('3');
        st.push('5');
        st.push('6');
        st.push('7');

//        deleteMid(st, st.size(), 0);
//        reverse_stack(st);
            sort_stack(st);

        while (!st.empty())
        {
            char p=st.pop();
            System.out.print(p + " ");
        }
    }

    private static void sort_stack(Stack<Character> st) {
        if(!st.isEmpty()){
            char x = st.pop();
            sort_stack(st);
            sort_Insertion(st,x);
        }
    }

    private static void sort_Insertion(Stack<Character> st, char x) {
        if(st.isEmpty() || x>st.peek()){
            st.push(x);
            return;
        }
        char tmp = st.peek();
        st.pop();
        sort_Insertion(st, x);
        st.push(tmp);
    }

    private static void reverse_stack(Stack<Character> st) {
        if(st.size()>0){
            char x = st.peek();
            st.pop();
            reverse_stack(st);
            insert_at_bottom(st, x);
        }
    }

    static void insert_at_bottom(Stack<Character> st, char x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        else{
            char a = st.peek();
            st.pop();
            insert_at_bottom(st, x);
            st.push(a);
        }
    }

    private static void deleteMid(Stack<Character> st, int n, int curr) {
        if(st.isEmpty() || curr==n){
            return;
        }
        char x = st.peek();
        st.pop();
        deleteMid(st, n, curr+1);
        if(curr != n/2){
            st.push(x);
        }
    }
}
