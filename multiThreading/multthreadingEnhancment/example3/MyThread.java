package multiThreading.multthreadingEnhancment.example3;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static ReentrantLock l = new ReentrantLock();
    MyThread(String name){
        super(name);

    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        if (l.tryLock()) {
            System.out.println(Thread.currentThread().getName() +"   ::::  "+ "Got Lock and providing safe opertaions");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
            l.unlock();
        }
    }else{
        System.out.println(Thread.currentThread().getName()+"   ::::  "+ "Unable to get lock, hence performaing alternative Operations");
    }   
}

}