package oops;

import java.util.Scanner;

public class TestStaticExcuationC  {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // static{
    //     System.out.println("i am static block");
    //     new TestStaticExcuationC().m1();
    // }
    // static int x = 1000;
    // {
    //     System.out.println("i am instane ");
    // }


    public static void main(String[] args) {
        System.out.println("i am main");
        //new TestStaticExcuationC().m1();

    
        String strA="", strB="",strC = " ";
        Scanner scn  =  new Scanner(System.in);
        strA = scn.nextLine();
        strB = scn.nextLine();
        for(int i = 0; i <strA.length(); i++){
            // both of string has same length otherwise we will get run time exceptition StringOutOfBounds 
            if(strA.charAt(i)!= strB.charAt(i)){
                strC += strA.charAt(i);//  we are getting charcater one by one  
                //strC = strC + strA;
            }
        }
        System.out.println(strC);
    
    
    
    
    

    
    
    }

    // void m1(){
    //     System.out.println("may value will be zero:" + x);
    // }
    







}
