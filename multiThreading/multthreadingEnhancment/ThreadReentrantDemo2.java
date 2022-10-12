package multiThreading.multthreadingEnhancment;

import java.util.concurrent.locks.ReentrantLock;
 class Display {
    ReentrantLock r = new ReentrantLock();
    
    public void wish(String name){
        r.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning" + " ");
            try {
                Thread.sleep(1000);
                System.out.println(name);
            } catch (Exception e) {
                // TODO: handle exception
                
            }
        }
    r.unlock();
    }
    
}

class MyThreadReentrant extends Thread{
    Display d;
    String name;
    MyThreadReentrant(Display d,String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }
}

public class ThreadReentrantDemo2{
    public static void main(String[] args) {
        Display d  = new Display();
        MyThreadReentrant mnt  = new MyThreadReentrant(d, "Dhoni");
        MyThreadReentrant mnt1  = new MyThreadReentrant(d, "youvRaj");
        MyThreadReentrant mnt2  = new MyThreadReentrant(d, "radhey");
    mnt.start();
    mnt1.start();
    mnt2.start();

    
    }
}