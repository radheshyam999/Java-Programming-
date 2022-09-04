package multiThreading;

public class MyThreadExample {
    public static void main(String[] args) {
         
        Thread t2 = new Thread(new Thread(){
           //Thread.currentThread().setName("child Thread");
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());    
                     
                }
                
            }
        },"child");
        Thread.currentThread().setName("main Thread");
        t2.start(); 
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    
     
    
}
