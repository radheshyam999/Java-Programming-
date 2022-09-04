package exceptionhandling;

import java.util.Scanner;

public class CustomerExceptionDemo {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);

        int age = Integer.parseInt(scn.nextLine());
        if(age > 60){
            throw new TooOldException(" I am more than 60 years old.");
        }else if(age < 18){
               throw new TooYoungException("I am less then  18."); 
        }
    }
    
}
