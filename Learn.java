import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Learn {

    String reverseWords(String S){   
       int findex = 0;
       int lindex= -1;
        int len  =  S.length();
        int i = 0;
        ArrayList<String> ls = new ArrayList<>();

        while (i < len-1 ){
            if(lindex == -1){            
                lindex = S.indexOf(".");
                ls.add(S.substring(findex, lindex));
                findex = lindex;
            }else{
                lindex = S.indexOf(".",findex+1);
                ls.add(S.substring(findex+1, lindex-1));    
                findex = lindex; 
                System.out.println(ls);
            }

        
        
            // if(S.charAt(i) == '.'){

        //     }


        i++;}

                    
        
    return "s";
    }   
    static void multi(int []a){
        for (int i = 0; i < a.length; i++) {
            a[i] *= i;
        }
    }
    
    


    int m[];
    public static void main(String[] args) {
        //new Learn().reverseWords("i.like.this.program.very.much");
        
        int x = 0;
        // naming rule for identifires 
        /** 
         * a -Z
            A -Z (0 9_ $)

         * 
        */


        int [] arr = new int[6];  //  defineation 
        // arr[0] = 5;
        // arr[1] = 6;
        // arr[2] = 7;
        // arr[3] = 8;
        // arr[4] = 9;
        // arr[5] = 10;
    
        // for (int i = 0; i < arr.length; i++) {
        //    arr[i] = i+10; 
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // = new int[4];
        // m[0] = new int[6];
        // m[1] = new int[4];
        // m[2] = new int[5];
        // m[3] = new int[1];

        // for (int i = 0; i < m.length; i++) {
        //     for (int j = 0; j < m[i].length; j++) {
        //         System.out.print(m[i].length + " ");
        //     }
        //     System.out.println();
        // }

            System.out.println(m.length);

        
        
        
        // int b = m.length;
        // for (int i = 0; i < m.length; i++) {
        //     m[i] = new int[b--];  // size colume 
        // }









        // for(int i = 0; i < m.length; i++){
        //     for (int j = 0; j < m[i].length; j++) {
        //          m[i][j] =  j;    
        //     }
        // }    

        // for(int i = 0; i < m.length; i++){
        //     for (int j = 0; j < m[i].length; j++) {
        //          System.out.print(m[i][j]); // 0123
        //                                     // 012                   
        //     }
        //     System.out.println();
        // }    
        
//System.out.println(reverseNumber(310));
//getFibonaci(5);      
//System.out.println(isPlandrom("abc"));    


    }
        
}
