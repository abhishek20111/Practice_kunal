package com.company;

import java.util.*;
class Pair implements Comparable<Pair>{
    private String productName;
    private int productId;
    private double productPrice;

    public Pair(String productName, int productId, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int compareTo(Pair obj){
        double p1 = obj.getProductPrice();
        double p2 = this.getProductPrice();
        if(p1>p2){
            return 1;
        }else if(p1<p2) return -1;
        else return 0;
    }
}
class Question implements Comparator<Pair>{
        public int compare(Pair obj1, Pair obj2){
            Pair p1 = obj1;
            Pair p2 = obj2;
            return p1.compareTo(p2);
        }
}

public class Product {

    public static void main(String[] args) {

        Pair item1 = new Pair("Abhi",32,23.3);
        Pair item2 = new Pair("Abhi1",232,343.3);
        Pair item3 = new Pair("Abhi2",42,43.3);
        List<Pair> list1 = new ArrayList<>();
        list1.add(item1);
        list1.add(item2);
        list1.add(item3);

        Collections.sort(list1, new Question());
        Iterator l1 = list1.listIterator();
        while(l1.hasNext()){
            System.out.println(l1.getClass());
            l1.next();
        }

    }

    public static void short_array(ArrayList<Question> arr){

    }
}
