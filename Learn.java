import java.util.ArrayList;

public class Learn {

    String reverseWords(String S){   
       int findex = 0;
       int lindex= -1;
        int len  =  S.length();
        int i = 0;
        ArrayList<String> ls = new ArrayList<>();

        while (i < len-1 ) {
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
    
    
    public static void main(String[] args) {
        new Learn().reverseWords("i.like.this.program.very.much");



    }
    
}
