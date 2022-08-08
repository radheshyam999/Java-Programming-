package garbagecollection;

import java.util.Date;

public class RunTimeDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory());

        for (int i = 0; i < 100000000; i++) {
            Date d =new Date();
            d = null;
        }
        r.gc(); // garbage collection request made 
        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory());

    }
    
}
