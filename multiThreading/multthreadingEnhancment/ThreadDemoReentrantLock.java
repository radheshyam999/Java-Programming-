package multiThreading.multthreadingEnhancment;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemoReentrantLock {
    public static void main(String[] args) {
        ReentrantLock r = new ReentrantLock();
        ReentrantLock r1 = new ReentrantLock(true);
            r.lock();
        //System.out.print(r.lock());
        System.out.println(r.isFair());
        System.out.println(r.isLocked());
        System.out.println(r.getQueueLength());
        System.out.println(r.isHeldByCurrentThread());
        System.out.println(r.getHoldCount());
            
    
    }
    
}
