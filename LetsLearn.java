import java.awt.Menu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.border.SoftBevelBorder;

/**
 * InnerLetsLearn
 */
public class LetsLearn {
    
    private static Object Counsumer;








    static  boolean  isPrime(int n){
        int i = 2;
        int sqrt = (int)Math.sqrt(n);
        while (i <= sqrt) {
            if(n % i == 0) return false;
        i++;}
    return true;
    }

  public static void printAllprims(int n){
        for(int i = 2; i<=n; i++){
           if(isPrime(i)){  
                System.out.print(i);
            }
        }
        System.out.println();
  }  
    
static void creatAnArrayList(int a[]){
    ArrayList<Integer>  al = new ArrayList<>();
    for(int i = 0; i < a.length; i++){
        if(a[i] % 10 == 5){ 
            al.add(a[i]);
            
        }

    }
    System.out.println(al);
    System.out.println("Size:" + al.size());
}  


// static void  beautifulPermutation(int n){
//         StringBuilder sb  = new StringBuilder();
//         for (int i = 1; i < n; i++) {
//             sb.append(1);    
//         }     
//         int  j = 0;
//         for (int i = 1; i < n; i++) {
//             for (; j < n; j++) {
//                 if(j == n){
//                     j = 0;
//                 }    
//             }  
//         }

// } 


















static void printUnqNumber(int a[]){
    int dupliacate = Integer.MIN_VALUE;
    int len = a.length;
    int count = 0;
    for(int i = 0;  i < len; i++){
        for(int j = i+1; j < len; j++){
            if(a[i] != dupliacate && a[i] == a[j]){
                a[j] = dupliacate;
                a[i] = dupliacate;
                count++;
                //System.out.println(a[i]);
            }
        }
    }

System.out.println(len - (2*count));
}
  



    
    
    
    
    public static void main(String[] args) {
        //  printAllprims(7);
        //  creatAnArrayList(new int[]{10,15,20,30,40,50,55,65});
        //  printUnqNumber(new int[]{10,15,20,30,40,50,55,65,10,15,20,30,40,50}); 
        // Consumer<String> s = System.out::print;
        // s.accept("Hello world");
         ArrayList<Integer> al = new ArrayList<>();
         List<Integer> abc = Arrays.asList(10,15,20,30,40,50,55,65); 
         al.add(10);
         al.add(20);
         al.add(33);
         al.add(21);
         al.add(77);
         al.add(80);
         al.add(100);
         al.add(101);
         al.add(500);
         al.add(576);
         al.add(301);
        
        // al.stream()
        //         .filter(a-> a%2 != 0)   
        //                         .forEach(System.out::println);
        
          List<Integer> evenNumbers =  al.stream().filter((a)->a%2 == 0).limit(3) 
            .collect(Collectors.toList());
         System.out.println(evenNumbers);



    }
    
}





































// interface Inner{
//     String get(String s);
    
// }

// 
//         String abc(){
//             return "abc";
//         } 









        //    Inner i =  (s)->  new LetsLearn().abc();


        // // List<String> str = Arrays.asList("a","b","A","B"); 
        // // System.out.println();
        // // str.sort(String::compareToIgnoreCase);
        // // System.out.println(str);;;
        // //abc = String::contains

        // //Integer::parseInt;


        // // String s = i.get("abc");
        // // int b  = 128;
        //  //x  = (byte)b;
        // //1byte = 8bits;
        // //String s = "abc";
        // //  Object ob  = new String("radhey"); 
        // //  StringBuffer sb = (StringBuffer)ob; 
        // //System.out.println(++x); 
        //   //abcvedjsdj 
        //  /* */
        // //System.out.println(x);

        // //- 2 pow n-1;
        // //(2pow n-1) -1
        // //char c =   
