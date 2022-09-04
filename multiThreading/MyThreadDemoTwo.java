package multiThreading;

public class MyThreadDemoTwo {
    Thread childThread = new Thread(){
        @Override
        public void run() {
               for (int i = 0; i < 10; i++) {
                    System.out.println("Child-Thread");
                    
                } 

        }
    };
    public static void main(String[] args) {
        new MyThreadDemoTwo().childThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main-Thread");
            Thread.yield();
      }
    }
}
