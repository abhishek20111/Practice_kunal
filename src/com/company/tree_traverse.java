package com.company;


import java.util.List;
import java.util.Stack;

class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
    int val;
    List<Integer> path;
    public Node(int val, List<Integer> path) {
        this.val = val;
        this.path = path;
    }
}

public class tree_traverse {
    Node root;

    tree_traverse(){
        root = null;
    }

    static void print_in_order(Node node){
        if(node==null){
            return;
        }
        print_in_order(node.left);
        System.out.println(node.key);
        print_in_order(node.right);
    }
    static void print_pre_order(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key + " ");
        print_pre_order(node.left);
        print_pre_order(node.right);
    }
    static void print_post_oder(Node node){
        if(node == null){
            return;
        }

        print_post_oder(node.left);
        print_post_oder(node.right);
        System.out.print(node.key + " ");
    }

//    void iterativePreorder(Node node) {
//
//        // Base Case
//        if (node == null) {
//            return;
//        }
//
//        // Create an empty stack and push root to it
//        Stack<Node> nodeStack = new Stack<Node>();
//        nodeStack.push(root);
//
//        /* Pop all items one by one. Do following for every popped item
//         a) print it
//         b) push its right child
//         c) push its left child
//         Note that right child is pushed first so that left is processed first */
//        while (nodeStack.empty() == false) {
//
//            // Pop the top item from stack and print it
//            Node mynode = nodeStack.peek();
//            System.out.print(mynode.data + " ");
//            nodeStack.pop();
//
//            // Push right and left children of the popped node to stack
//            if (mynode.right != null) {
//                nodeStack.push(mynode.right);
//            }
//            if (mynode.left != null) {
//                nodeStack.push(mynode.left);
//            }
//        }
//    }

    public static void main(String[] args) {
        tree_traverse tree = new tree_traverse();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

//        print_in_order(tree.root);
//        print_pre_order(tree.root);
        print_post_oder(tree.root);
    }
}

