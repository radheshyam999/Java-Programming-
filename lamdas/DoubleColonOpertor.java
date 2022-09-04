package lamdas;

public class DoubleColonOpertor {
  /** Argument must be matched therwise we cant use method refernced  */  
    public void m1(){
        for(int i = 0; i < 10; i++){
            System.out.println("i am method refernce  " + Thread.currentThread().getName());
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable r  = new DoubleColonOpertor()::m1;
        Thread t  = new Thread(r);
        t.setName("child");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName());
        }
       
        
       
        
    }




}
