package multiThreading;

public class MyThread extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);    
            } catch (Exception e) {
                //TODO: handle exception
            }
            
            
            System.out.println("ChildThread_1");
        }
    }

    
}