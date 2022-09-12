package multiThreading;
 


/* A
 */
class A {
       synchronized void first(B b){
            for (int i = 0; i < 10; i++) {
                System.out.println("I am A class A's First method " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            b.end();
        }
    
        synchronized void last(){
            for (int i = 0; i < 10; i++) {
                System.out.println("I am class A's Last methods " + Thread.currentThread().getName());
            }
        }


}

/**
 * B
 */ class B {

    synchronized void begning(A a){
        for (int i = 0; i < 10; i++) {
            System.out.println("I am  class B's begning methods " + Thread.currentThread().getName());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        a.last();
    }

    synchronized void end(){
        for (int i = 0; i < 10; i++) {
            System.out.println("I am class B's  end method " + Thread.currentThread().getName());
        }
    }


}



public class MyDemoDeadLock {


    public static void main(String[] args) {
        A a  = new A();
        B b  = new B();
        a.first(b);
        Thread t = new Thread(()->b.begning(a));
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
    
}
