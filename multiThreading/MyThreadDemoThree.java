package multiThreading;

public class MyThreadDemoThree {
        
    static Thread myThread = new Thread(){
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("sita Thread");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        
    
    }; 
    public static void main(String[] args) {
        myThread.start();
        try {
        System.out.println("helo");    
        myThread.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Rama Thread");
            }
                
        
        //Thread.sleep(1000);
        } catch (InterruptedException e) {
            //TODO: handle exception
                e.printStackTrace();
        }
   
    }
    

}
