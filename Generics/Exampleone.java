package Generics;

import java.util.ArrayList;

public class  Exampleone{

    public static void main(String[] s){
        ArrayList Al = new ArrayList();
        Al.add("abc");
        Al.add("def");
        Al.add("ghi");
        Al.add("klm");
        for (Object x : Al) {
            System.out.println(x);
        }
    }
}