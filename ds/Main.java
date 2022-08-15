package ds;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        MyLinkedList<Integer> ml = new MyLinkedList<Integer>();
        Scanner  scan =  new Scanner(System.in);
        int value = 1;
        while(value != 0){
            value = scan.nextInt();
            ml.addAtLast(value);
        }
        
        ml.showElement();
        
        ml.addAtBegening(scan.nextInt());
        ml.showElement();
        //System.out.println("delete number which you want");
        ArrayList<Integer> al =  ml.getArrayList();
        System.out.println(al);
        System.out.println();
        ml.showElement();
        scan.close();
        
    }
}
