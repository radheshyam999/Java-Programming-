package multiThreading.multthreadingEnhancment;

/**
 * ThreadGroupExample
 */
public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup g1 = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread[g1.activeCount()];
        g1.enumerate(t);
        for (Thread thread : t) {
            System.out.println(thread.getName() + "::" + thread.isDaemon());
        }
        
    }

    
}