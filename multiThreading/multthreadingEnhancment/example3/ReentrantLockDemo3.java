package multiThreading.multthreadingEnhancment.example3;

public class ReentrantLockDemo3 {
    public static void main(String[] args) {
        MyThread m = new MyThread("Firts Thread");
        MyThread m1 = new MyThread("Second Thread");
        m.start();
        m1.start();
    }
    
}
