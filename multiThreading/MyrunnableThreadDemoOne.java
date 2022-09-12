package multiThreading;

public class MyrunnableThreadDemoOne {

    public static void main(String[] args) throws InterruptedException {
        //MyrunnableThreadDemoOne chilThread = new MyrunnableThreadDemoOne();
        //new MyrunnableThread()

        Thread mt  = Thread.currentThread();
        Thread t = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("child Thread" + Thread.currentThread().getName());
            }
            
        
        });
        t.start();
        
        try {
            t.join(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    
    //Object obj[] = new String[5];
    
    }
    
}

/****
 1. Explain about synchronized keyword and its advantages and disadvantages?
2. What is object lock and when a Thread required?
3. What is class level lock and when a Thread required?
4. What is the difference between object lock and class level lock?
5. While a Thread executing a synchronized method on the given object is the
remaining Threads are allowed to execute other synchronized methods
simultaneously on the same object?
Ans: No.
6. What is synchronized block and explain its declaration?
7. What is the advantage of synchronized block over synchronized method?
8. Is a Thread can hold more than one lock at a time?
Ans: Yes, up course from different objects. Example: 






 */


