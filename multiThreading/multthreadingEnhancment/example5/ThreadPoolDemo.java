package multiThreading.multthreadingEnhancment.example5;

import java.security.Provider.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(ThreadPoolDemo::mi);
        service.submit(ThreadPoolDemo::mi);
        service.submit(ThreadPoolDemo::mi);
        service.submit(ThreadPoolDemo::mi);    
        service.submit(ThreadPoolDemo::mi);
        service.shutdown();

    }


    static int mi(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return 0;
    }
    
}
