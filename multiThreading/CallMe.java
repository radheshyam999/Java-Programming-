package multiThreading;

public class CallMe {
        public CallMe(){}
        public void call(String msg){
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            System.out.println("]");
        }
    }
    /**
     * 
     */
    