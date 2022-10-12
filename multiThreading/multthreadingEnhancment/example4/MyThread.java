package multiThreading.multthreadingEnhancment.example4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static ReentrantLock r  = new ReentrantLock();
    MyThread(String name){
        super(name);        
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        do {
            try {
                if (r.tryLock(30,TimeUnit.SECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "Got lock and performaing safe opertaions");
                    Thread.sleep(1000);
                    r.unlock();
                    System.out.println(Thread.currentThread().getName() + "Relise Lock");
                    break;
                }else{
                    System.out.println(Thread.currentThread().getName() + "released lock ");
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }



        } while (true);
    }
    
}
