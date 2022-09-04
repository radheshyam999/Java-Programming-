package lamdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Predicate;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) throws InterruptedException {
    //System.out.println("I m not LAMADAs ");
    // intrif i = ()-> {
    //     System.out.println("hello lamda ");
    //     return 1;
    //     };
    //     //i.m1();
        //  Another One
        //intrif2 i2  =  ((a, b) -> a*b);
        //System.out.println(i2.m2(5, 2));

        //Another one //three 
        //intrif3 i3 = s-> s.length();
       //System.out.println("length of String " + i3.m3("abc"));
       // Another example //  four
       //Intrif4 i4 =  (s) -> s.length();

       // Going to excuted by  child method
        
    // for (int j = 0; j < 10; j++){
    //     System.out.println(Thread.currentThread().getName());
    // }


    // Runnable r = ()->{
    // for (int j = 0; j < 10; j++){
    //     System.out.println(Thread.currentThread().getName()); 
    // }
        
    //     System.out.println("loop ends here");
    // };
        
    // Thread t = new Thread(r);
    //t.setPriority(10);
    //t.setName("child");
    //t.start(); 
    
  
  
  
  
  
  
  
    //System.out.println('9' -48 );


      // using lambda expression for for user defined sorting order 
      int a[] = new int[]{9,5,8,7,3,9,8,4,3};
    ArrayList<Integer> ls = new ArrayList<>();
      for(int x: a)
        ls.add(x);
    //Collections.sort(ls,(I1,I2)-> (I1 > I2)? -1: (I1 < I2) ? +1:0);
    //{
      // if (ob1 > ob1) 
      //   return -1;
      //  else if(ob1 < ob1) 
      //   return +1;
      // else
      //   return 0;

        //return (ob1 > ob1)? -1: (ob1 < ob1) ? 1:0;

      
    //});
    //System.out.println(ls);
      //Comparator com = 






      TreeSet<Integer> st = new TreeSet<>((I1,I2)-> (I1 > I2)? -1: (I1 < I2) ? +1:0);
      for (Integer it : a) {
         st.add(it);
      }
      //System.out.println(st);

      Predicate<Integer> p = (i)-> i<10;
      System.out.println(p.test(5));
  }  
}