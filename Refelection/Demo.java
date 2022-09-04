package Refelection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) throws ClassNotFoundException {
        try (Scanner scn = new Scanner(System.in)) {
            Class cl = Class.forName(scn.nextLine()); 
                    
            Method[] m =   cl.getDeclaredMethods();
            for (Method method : m) {
                System.out.println(method.getName());
            }
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }    
    }
}
