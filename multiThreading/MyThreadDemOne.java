package multiThreading;

public class MyThreadDemOne {

    public static void main(String[] args) {
        MyThread childThread   = new MyThread();
        childThread.start();
        
        
        for (int i = 0; i < 10; i++) {
           
            try {
                Thread.sleep(1000);    
            } catch (Exception e) {
                //TODO: handle exception
            }
            System.out.println("MainThread -1");
        }

    }
}
