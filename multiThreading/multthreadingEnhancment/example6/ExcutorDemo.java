package multiThreading.multthreadingEnhancment.example6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorDemo {
    public static void main(String[] args) {
        PrintJob[] jbs = {
            new PrintJob("abc"),
            new PrintJob("Radhey"),
            new PrintJob("shyam"),
            new PrintJob("miche"),
            new PrintJob("alternative"),
            new PrintJob("joker"),
            new PrintJob("sim"),
            new PrintJob("vodafone"),
        };
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (PrintJob printJob : jbs) {
            service.submit(printJob);
        }
        service.shutdown();



    }
    
}
