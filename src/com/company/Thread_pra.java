package com.company;

public class Thread_pra {
    public static void main(String[] args) {
//        msg m = new msg();
//        outThread t1 = new outThread(m, "abhishek");
//        outThread t2 = new outThread(m, "No one");
//        t1.start(); t2.start();
//        for (int i=0; i<=3; i++){
//            System.out.println("how are --------- ");
//        }


        Bank obj = new Bank(5000);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start(); t2.start();

        Bank obj2 = new Bank(5000);
        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);

        t3.start(); t4.start();
    }
}
class msg{
//    public synchronized void show(String name){
    public void show(String name){

        synchronized (this){
            for (int i=0; i<=3; i++){
                System.out.println("how are you "+name);
            }
        }

    }
}
class outThread extends Thread{
    msg m;
    String name;
    outThread(msg m, String name){
        this.m = m;
        this.name = name;
    }
    public void run(){
        m.show(name);
    }
}


class Bank extends Thread{
    static int bal=5000;
    static int withdraw;
    Bank(int withdraw){
        this.withdraw = withdraw;
    }
//    public synchronized void run(){
//        String name=Thread.currentThread().getName();
//        if(withdraw <= bal){
//            bal = bal - withdraw;
//            System.out.println(name+" withdraw "+bal);
//        }
//        else {
//            System.out.println("Insufficent ");
//        }
//    }
    public static synchronized void withdraw1(){
        String name=Thread.currentThread().getName();
        if(withdraw <= bal){
            bal = bal - withdraw;
            System.out.println(name+" withdraw "+bal);
        }
        else {
            System.out.println("Insufficent ");
        }
    }

    public void run(){
        withdraw1();
    }
}
