import javax.imageio.ImageReader;

public class Coding_pract {
    public static void main(String[] args) {
        sub_runable q = new sub_runable();
        Thread obj = new Thread(q);
        obj.start();
        System.out.println("MAin class");
        for (int i = 0; i < 5; i++) {
            System.out.println("Main class Thread");
        }

//        threa_extend obj = new threa_extend();
//        obj.start();
    }
}
//class threa_extend extends Thread{
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println("hi _ in Thread class");
//        }
//    }
//}
class sub_runable implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
        }
    }
}
