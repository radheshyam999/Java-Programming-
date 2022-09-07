package lamdas;

import javax.swing.plaf.synth.SynthSliderUI;

/**
 * Assginment
 */
public class Assginment {
     static int fact(int n){
        if(n==1) return n;
        return n*fact(n-1);
        /***
        int fact =1; 
        int i = 1;
          while(i<=n){
            fact *= i;
          }
          return fact;
         */   } 

/*** 2 */
static String removetheSpace(String s){
    StringBuilder sb  = new StringBuilder();
    char c = ' ';
    for(int i = 0; i < s.length(); i++){
        c = s.charAt(i);
        if(c != ' ')
            sb.append(c);
                 
    }
    return sb.toString();
    //return s.trim();

}



static void algorithams(int n){
    while(n >=1){
        if(n <= 1 ) break;
        if(n % 2 == 0){
            n /=2;
            System.out.println(n); 
        }else{
            n = (n*3) + 1;
            System.out.println(n);
            }
}
}


/**4**/
static int arthmeticProgression(int a[]){
   int sum =  ((a.length+1) * (a.length))/2;

    System.out.println(a.length+1);

    for(int i = 0; i < a.length; i++)
        sum -= a[i]; 
    return sum;
}




/*
*/



static int rverseNumber(int n){
    int  remainder ;
    int r = 0;
    int  k  = 0;
    while(n >= 1){
      remainder =  n % 10;
       
       n /=10;
       
       if(r == 0){
        ++k;    
        r = remainder*10;
       }else{
        r *= 10;
        remainder *= 10; 
        r = r+remainder;
    }
        
         //return r;
    }

// StringBuilder sb  = new StringBuilder(n);
// sb.reverse();
    return r/10;
}


void countMax(String s){
    char c = 0 ,c2 = 0;
    int count = 0,mx = 0;
    for (int i = 0; i < s.length(); i++) {
        count = 0;
        for (int j = i+1; j < s.length(); j++) {
            if(s.charAt(i) == s.charAt(j)){
                count++;
                c = s.charAt(i);
            }
        }
        if(count > mx){
            mx = count;
            c2 = s.charAt(i);
        }
    }
System.out.println("Charcater:" + c2 + "Number Of Time:" + mx);
}

void  lastproblem(int a[]){

}









public static void main(String[] args) {
 //System.out.println(rverseNumber(1000));
    
    //System.out.println(fact(5));
//System.out.println(removetheSpace(" abc def "));
//algorithams(3);
System.out.println(arthmeticProgression(new int[]{1,2,3,4,5,7,8,9,10}));
;

}









}