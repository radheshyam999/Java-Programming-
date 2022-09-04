package Collectionsjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Main
 */
public class Main {

    static  Comparator <Integer>comp ; 
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                    return 01 > o2 ? 1: -1;
            }
    
        }); 
        for(int i = 0; i < arr.length; i++) ts.add(arr[i]);
        Iterator it = ts.iterator();
        int m = 0;
        while (it.hasNext()) {
            System.out.println(m);
            if( k == l){
                m =  (Integer)it.next();    
                break;
            }
            m = (Integer)it.next();





































































            m++;}    
    return m;} 

            public static void main(String[] args) {
                System.out.println("hello world");
                try {
                    System.out.println(kthSmallest(new int[]{7, 10, 4, 20, 15,}, 5, 5, 4));    
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
                System.out.println("hello world");

            }

            public static int kthSmallest(int[][]mat,int n,int k){   
                int count  = 0, value = 0;
                //code here.
                for(int i = 0; i < n; i++){
                    if(count==k) break;
                    for(int j = 0; j < n; j++){
                        if(count == k){
                            value = mat[i][j];
                            break;
                        }
                    count++;   
                    }   
                }
                for(int i = 0; i < n; i++){
                    if(count == k) break;
                    for(int j = 0; j < n; j++){
                        if(count == k){
                            value = mat[i][j];
                            break;
                        }
                    count++;   
                    }
                }
                return value;   
            }        


}