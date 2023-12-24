package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims_Algo {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Prims_Algo(int v){
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    class PrimsPair{
        int e1;
        int acqv; //aquireing vertix
        int cost;
        public  PrimsPair(int e1, int acqv, int cost){
            this.e1 = e1;
            this.acqv = acqv;
            this.cost = cost;
        }
    }
    public void Prims(){
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>();
        pq.add(new PrimsPair(3, 3,0));
        HashSet<Integer> visited = new HashSet<>();
        while (!pq.isEmpty()){
            PrimsPair rp = pq.poll();
            if(visited.contains(rp.e1))continue;

            visited.add(rp.e1);
            System.out.println(rp);
            for (int nbrs : map.get(rp.e1).keySet()) {
                if(!visited.contains(nbrs)){
                    int cost = map.get(rp.e1).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.e1, cost));
                }
            }
        }
    }
}
