package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {



public static void main(String[] args) {
    int a[] = new int[1];
    try {
        a[1]= 30/0;
        a[2] = 50;

    } catch (ArithmeticException  e) {
        //TODO: handle exception
        System.out.println("exception1");
    }
    catch (ArrayIndexOutOfBoundsException  e) {
        //TODO: handle exception
        System.out.println("exception2");
    }
    System.out.println("rest");
    
}





//    static  String reverseWords(String S)
//     { 
        
//         StringBuilder sb = new StringBuilder();  
//         // your code here
//         java.util.regex.Pattern p = java.util.regex.Pattern.compile("[.]");
//         String []sarr =  S.split("[.]");
//         for (String string : sarr) {
//             sb.append(new StringBuilder(string).reverse() + "."); 
//         }

//         sb.deleteCharAt(sb.length()-1);
//         System.out.println(sb  +" ");
        
        
        
//         // Matcher m  = p.matcher(S);
//         // while (m.find()) {
//         //     System.out.println(m.start());    
//         // }
        
//       return S;  
//     }
//     public static void main(String[] args) {
//         reverseWords("i.like.this.program.very.much");
    
//     }
    
}
