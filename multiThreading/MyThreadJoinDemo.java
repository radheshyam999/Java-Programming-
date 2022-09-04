package multiThreading;

public class MyThreadJoinDemo {



    public static void main(String[] args) {
                Runnable r = ()->{
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName());
                    }
                };
              Thread cur = new Thread(r);
              cur.setName("child");
              cur.start();

              try {
                cur.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

              for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
              }
              



    }
    
}
