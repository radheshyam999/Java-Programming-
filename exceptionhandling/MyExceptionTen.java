package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class MyExceptionTen {
    public static void main(String[] args) {
        System.out.println("im statring ");
    try(BufferedReader br =  new BufferedReader(new FileReader("MyExceptionSeven.java"))) {
       
        while (true) {
            System.out.println(br.readLine());
        }
        
        //br.readLine()

    }catch(IOException  e){
        e.printStackTrace();
        System.out.println("hello");
    }
}
}
