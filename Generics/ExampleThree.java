package Generics;

import java.util.ArrayList;

public class ExampleThree {
     public static void main(String[] args) {
        ArrayList<String> al  = new ArrayList<String>();
        al.add("durga");
        al.add("radhey");
        al.add("mike");
        //al.add(new Integer(10)); // we get compile time error 
        System.out.print(al.get(3));    
    }
    
    
    
}
