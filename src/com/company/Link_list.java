package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.*;

//public class Link_list {
//    public static void main(String[] args) {
//
//    }
//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//}
class Link_list{
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int [] arr = nextGreaterElement(nums1,nums2);
        System.out.println(arr);
    }



    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<Integer>();
        HashMap<Integer,Integer> hashMap =  new HashMap();

        int [] ans  = new int[nums1.length];
        for (int i = nums2.length-1; i >= 0; i--) {
            while (!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            int result = st.isEmpty() ? -1 : st.peek();
            hashMap.put(nums2[i], result);
            st.add(nums2[i]);
        }

        int j = 0;
        int [] ans1 = new int[nums1.length];
        for (int num : nums1) {
            ans1[j++] = hashMap.get(num);
        }
        return ans1;
    }

    public boolean valid_parentheses(String s){
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(c);
            }
            else if( (st.peek()=='(' && c == ')') ||
                    (st.peek()=='[' && c == ']') ||
                    (st.peek()=='{' && c == '}') ){
                st.pop();
            }
        }

        if(st.size()==0){
            return true;
        }
        return false;
        }

    }
