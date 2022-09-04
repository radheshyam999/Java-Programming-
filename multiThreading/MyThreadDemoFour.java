package multiThreading;

public class MyThreadDemoFour {

    static Thread myThread = new Thread(){
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("sita Thread");
               
            }

            try {
                    
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
        
    
    }; 
    public static void main(String[] args) {
        myThread.start();
        try {
        System.out.println("helo");    
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Rama Thread");
            }
                
            
            myThread.join();
        //Thread.sleep(1000);
        } catch (InterruptedException e) {
            //TODO: handle exception
                e.printStackTrace();
        }
   
    }

    
}
