package multiThreading.multthreadingEnhancment.example6;

public class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println(name + "  ::: " + "job strated by thread  " + " ::: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(name +"   :::   "+ "   job strated by thread" + "  :::  " + Thread.currentThread().getName());
        }
    
    }
    
}
