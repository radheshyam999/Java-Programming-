package multiThreading;

public class MyrunnableThreadDemoOne {

    public static void main(String[] args) {
        //MyrunnableThreadDemoOne chilThread = new MyrunnableThreadDemoOne();
        Thread t = new Thread(new MyrunnableThread());
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
    
}
