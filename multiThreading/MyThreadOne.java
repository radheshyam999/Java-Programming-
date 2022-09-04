package multiThreading;

public class MyThreadOne extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = 0; i < 10; i++) {
            System.out.println("child_Thread");
            
        }
    }
    
    public void run(int x) {
        // TODO Auto-generated method stub

        for (int i = 0; i < 10; i++) {
            System.out.println("");
            
        }
    }
}
