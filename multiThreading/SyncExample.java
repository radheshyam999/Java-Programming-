package multiThreading;

//import multiThreading.CallMe.Caller;

 
public class SyncExample {
    public static void main(String[] args) {
      System.out.println("excutation statrted");
        CallMe target = new CallMe();
      Thread ob1 = new Thread(new Caller(target, "hello"));
      Thread ob2 = new Thread(new Caller(target, "Radhey"));
      Thread ob3 = new Thread(new Caller(target, "Shyam"));
      Thread ob4 = new Thread(new Caller(target, "dubey"));  
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();
        System.out.println("excutation ended");

    
    }    
    }
    