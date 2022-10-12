package multiThreading.multthreadingEnhancment;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("radhey");
        ThreadGroup g2 = new ThreadGroup("shyam");
        Thread t1 = new Thread(g1,"Thread-1");
        Thread t2 = new Thread(g2,"Thread-2");
        g1.setMaxPriority(9);
        Thread t3 = new Thread(g1,"Thread-3");
        System.out.println(g1.getMaxPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
    
}
