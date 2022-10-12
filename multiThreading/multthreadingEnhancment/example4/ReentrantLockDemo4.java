package multiThreading.multthreadingEnhancment.example4;

public class ReentrantLockDemo4 {
    public static void main(String[] args) {
        MyThread t = new MyThread("First Thread");
        MyThread t2 = new MyThread("Second Thread");
        t2.start();
        t.start();
    }
    
}
