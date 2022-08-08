package Generics;

import java.util.ArrayList;

public class ExampleTwo {
  public static void main(String [] s){
    ArrayList l = new ArrayList();
         l.add("abc");
         l.add("def");
         l.add("ghi");
         l.add("klm");
  String s2 = (String) l.get(0);// typecasting is required 
 System.out.print(s2);        
}
    

}
