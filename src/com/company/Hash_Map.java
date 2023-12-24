package com.company;

import java.util.*;

// for implement tree Map , we use Red Black Tree = A red–black tree is a binary search tree in which each node is colored either red or black.
// The nodes in the tree are arranged in a way that ensures that the number of black nodes on any path from the root to a leaf node is the same.
//Map is interface and All other HashMap, LinkedHashMap, TreeMap are classes
//HashMap store in random order O(N), it can store null as key
//TreeMap store in alphabetical order O(logN), we cant put null as key
//LinkedHashMap store as it store O(1) , it can store null as key, it create by doubly LinkedList
//Set, Map are interface, (Set )-> HashSet, TreeSet, LinkedHashSet , they are same as Map classes
//map.keySet() -> return all keys in set and print it



//THF(Threshold factor )=max amout to store in buket
//LF(load factor) = how much space you used uin bucket
public class Hash_Map<K,V> {

    class Node{
        K key;
        V value;
        Node next;

        public Node(){
        }

        public  Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

//    Node []arr = new Node[8]; // as we need to use generic <8> but when we put it will give syntax error so we use ArrayList
    private ArrayList<Node> ll;
    private int size ;

    public Hash_Map(int n){
        ll = new ArrayList<>();
        for(int i=0; i<n; i++){
            ll.add(null);
        }
    }
    public Hash_Map(){
        this(4);
        size = 0;
    }

    //hash Fuction = give random no in given specific range with specific key as paramter, range lie as of Integer
    public  int hashFun(K key){
        int bn = key.hashCode()%ll.size();
        if(bn<0) bn = bn+ll.size();
        return bn;
    }

    public void put(K key, V value){
        int idx = hashFun(key);
        Node temp = ll.get(idx);
        while (temp != null){
            if(temp.key.equals(key)){// equal => use when we compare wraper classes
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node(key, value);
        temp = ll.get(idx);
        nn.next = temp;
        ll.set(idx, nn);// set new address on idx index
        size++;
        //THF(Threshold factor )=max amout to store in buket
        //LF(load factor) = how much space you used uin bucket
        double thf = 2.0;
        double lf = (1.0*size)/ll.size();
        if(lf>thf){
            rehashing();
        }
    }

    private void rehashing() {
        ArrayList<Node> new_List = new ArrayList<>();
        for (int i = 0; i < 2 * ll.size(); i++) {
            new_List.add(null);
        }
        ArrayList<Node> oba = ll;
        ll  = new_List;
        for(Node temp: oba){
            while (temp != null){
                put(temp.key, temp.value);
                temp = temp.next;
            }
        }
    }

    @Override
    public String toString() {
        String s = "{ \n";
        for(Node temp: ll){
            while (temp != null){
                s = s+ temp.key +" : "+temp.value+" \n";
                temp = temp.next;
            }
        }
        return s+"}";
    }

    public V get(K key){
        int idx = hashFun(key);
        Node temp = ll.get(idx);
        while (temp != null){
            if(temp.key.equals(key)){// equal => use when we compare wraper classes

                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public Boolean containsKey(K key){
        int idx = hashFun(key);
        Node temp = ll.get(idx);
        while (temp != null){
            if(temp.key.equals(key)){// equal => use when we compare wraper classes
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public V remove(K key){
        int idx = hashFun(key);
        Node curr = ll.get(idx);
        Node prev = null;
        while (curr != null){
            if(curr.key.equals(key)){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if(curr == null) {
            return null;
        }
        else if(prev == null){
            ll.set(idx, curr.next);
            size--;
            return curr.value;
        }else{
            prev.next = curr.next;
            curr.next = null;
            size--;
            return  curr.value;
        }
    }


    public static void main(String[] args) {
        Hash_Map<String, Integer> map = new Hash_Map<>();
        map.put("R", 78);
        map.put("k", 342);
        map.put("a",32);
        map.put("b",123);
        System.out.println(map.containsKey("a"));
        System.out.println(map.get("b"));
        System.out.println(map);



    }
}
