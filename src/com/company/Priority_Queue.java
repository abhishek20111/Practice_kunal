package com.company;


import java.util.*;

public class Priority_Queue {
    private ArrayList<Integer> list;

    public Priority_Queue() {
        list = new ArrayList<>();
    }

    public static void main(String[] args) {
        Priority_Queue heap = new Priority_Queue();
        heap.add(5);
        heap.add(7);
        heap.add(6);
        heap.add(1);
        heap.add(4);
        heap.add(9);
        heap.add(7);
        heap.display();
        System.out.println(heap.get());
        System.out.println(heap.remove());
        heap.display();
    }

    public void add(int item) {
        this.list.add(item);
        uphepify(list.size() - 1);
    }

    private void downheapify(int pi) {
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        int mini = pi;
        if (lci < list.size() && list.get(lci) < list.get(mini)) mini = lci;
        if (rci < list.size() && list.get(rci) < list.get(mini)) mini = rci;

        if (mini != pi) {
            swap(mini, pi);
            downheapify(mini);
        }
    }

    private void uphepify(int i) {
        int pi = (i - 1) / 2;
        if (list.get(pi) > list.get(i)) {
            swap(pi, i);
            uphepify(pi);
        }
    }

    private void swap(int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public int remove() {
        int rv = list.get(0);
        swap(0, list.size() - 1);
        list.remove(list.size() - 1);
        downheapify(0);
        return rv;
    }

    public int get() {
        return list.get(0);
    }

    public void display() {
        System.out.println(list);
    }
}
