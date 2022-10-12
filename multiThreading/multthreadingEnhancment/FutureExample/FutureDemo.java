package multiThreading.multthreadingEnhancment.FutureExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        MyCallAble[] jobs = {
            new MyCallAble(10),
            new MyCallAble(20),
            new MyCallAble(30),
            new MyCallAble(40),
            new MyCallAble(50),
            new MyCallAble(100),
            new MyCallAble(200),
            new MyCallAble(300),
            new MyCallAble(400),
            new MyCallAble(500)
        };

        ExecutorService service = Executors.newFixedThreadPool(5);
        for (MyCallAble myCallAble : jobs) {
           Future f =  service.submit(myCallAble);
           System.out.println(f.get());
           
        }
        service.shutdown();
    }
    
}
