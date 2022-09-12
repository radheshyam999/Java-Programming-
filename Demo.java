import java.io.File;
import java.io.OutputStream;
import java.math.BigInteger;
import java.time.Month;
import java.util.Arrays;
@FunctionalInterface
interface Genratecard{
    void getCard(OutputStream op); 
}
/**
 * Demo
 */
public class Demo {



//401234567891234
static int genrateCard[] = {0,1,2,3,4,5,6,7,8,9};
static StringBuilder sb = new StringBuilder("4");

 //  for genrating vis card
 
 void  fifthedigitcard(OutputStream op){
    //op->op::println;
    sb.ensureCapacity(16);
    for (int a = 0; a < genrateCard.length; a++) {
        for (int b = 0;  b < genrateCard.length; b++) {
            for (int c = 0; c < genrateCard.length; c++){
                for (int d = 0; d < genrateCard.length; d++){
                    for (int e  = 0; e < genrateCard.length; e++){
                        for (int f = 0; f < genrateCard.length; f++) {
                            for (int g = 0;  g < genrateCard.length; g++) {
                                for (int h = 0; h < genrateCard.length; h++){
                                      for (int i = 0; i < genrateCard.length; i++){
                                        for (int j  = 0; j < genrateCard.length; j++){
                                            for (int k  = 0; k < genrateCard.length; k++){
                                                for (int l = 0; l < genrateCard.length; l++) {
                                                    for (int m = 0;  m < genrateCard.length; m++) {
                                                        for (int n = 0; n < genrateCard.length; n++){
                                                                for (int o = 0; o < genrateCard.length; o++){
                                                                        sb.delete(0, 16);
                                                                        sb.append("4"+a+b+c+d+e+f+g+h+i+j+k+l+m+n+o);
                                                                        System.out.println(sb);
                                                                }      
                                                            }      
                                                        }   
                                                    }
                                                }
                                            }   
                                        }    
                                    }       
                                }   
                            }

                        }   
                    }    
            }   
        }   
     }
 
 
 
// main method is going to end here
}

void getCvv(int typeOfCard){
    typeOfCard = (typeOfCard > 3) ? (typeOfCard == 5) ? typeOfCard-2:typeOfCard-1:typeOfCard+1;
    for (int a = 0; a < 9; a++) {
        for (int b = 0; b < 9; b++) {
            for (int c = 0; c < 9; c++) {
                System.out.println("" + a + b + c);
            }
        }    
    }
}
static boolean isLeapYear(int year){
    if (year % 4 == 0 || year % 400 == 0){
            if(year % 4 != 0 && year % 400 != 0) return false;
            else return true;
    }else return false;
    
}

void  getDate(int year){
    Month[] m ={Month.JANUARY,Month.FEBRUARY,Month.MARCH,Month.APRIL, Month.MAY, Month.JUNE, Month.JULY,Month.AUGUST,Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER,Month.DECEMBER};
    for (Month month : m) {
       //System.out.println(month.length(isLeapYear(2022)));      
       for (int j = 0; j < month.length(isLeapYear(year)); j++) {
                System.out.println(month + "-" + "0" + j + "-" + year);
            }
    }
}

static Integer funn(Integer a, Integer b){
    if((b&a)< (a+b) && (b -a) > (a-b)){
        b  = (b+2) + b;
        a  = 2 + 1 + b;
        b =  b +2;
        return a+funn(a, b);
    }
    b = 1 + 1+b;
return b-a;
}
static int MinimumUnfairness(int[] arr, int n , int k){
        Arrays.sort(arr);
        int[] x = new int[k];
        int min     =   Integer.MAX_VALUE;
        int max     =   Integer.MIN_VALUE;
        for (int i = 0; i < k; i++)
        {
            x[i] = arr[i];
            if(min > x[i])
                min = x[i];
            if(max < x[i])
                max = x[i];   
        }
    return max  - min;
}
    public static void main(String[] args) {
       int x =  MinimumUnfairness(new int[]{1,2,289,4,292,23,102,100,291},10,4);
    System.out.println(x);
    
    
    
    
    
    
    
        // int p = 6,  q = 2,r = 6;
    // for(int i = 2; i < 6; i++){
    //     q = (p+q) + r;

    // }   
    
    // System.out.println(p+q);
    
    
    
    
    // q = (p+9) & r;
        
        // if ((q^r^p) < (r+p+q)) {
        //     if((3^q^r) < (8+r+p)){
        //         q  = 9&q;
        //     }else{
        //         q  = (7+6)+r;
        //     }
        //     p = (11+3) + r;
        // }     
    
        //System.out.println(p+q+r);
    
    
    
       //    if(a < b || (a+c) < (c-a)){
    //     a  = 8+a;
    //     a  = (10+4) + b;
    //    }
    //    System.out.println(a+c+b);

    
    
    
    
    
       //    for(int i = r; i < 8; i++){
    //     p =2+p;
    //     if((r+p) < (p-r)){
    //         p = (r+q) + p;
    //     }
    //     else{
    //         //continue;
    //     }
    //     q = 8&r;
    //    }
    //    System.out.println(p+q);







        // Integer a = 4,b = 6;
        // System.out.println(funn(a, b));
        // ;
 
        // b = 7^b;
        // if ((c-a-b) < (b-c)) {
        //     a  = (a+2) + a;
        // }

        // System.out.println(a+b+c);
       
       
       
       
       
       
       
       
       
    
       
        //  Genratecard visaCards = (OutputStream op)->{
            
        //     new Demo().fifthedigitcard(op);
        //  };
        //  //visaCards.getCard(null); 
        //  Month[] m ={Month.JANUARY,Month.FEBRUARY,Month.MARCH,Month.APRIL, Month.MAY, Month.JUNE, Month.JULY,Month.AUGUST,Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER,Month.DECEMBER};
        //  for (Month month : m) {
        //     //System.out.println(month.length(isLeapYear(2022)));   
        //  }     
        //System.out.println(10%2==0 ?  "afvdvskfb" : "i am radhey");
        
       //System.out.println(funn(2, 5, 10));
        
    //    Integer pp = 2, qq = 6,rr = 7;
    //    if ((6-6) <(8+qq)) {
    //     rr = rr^pp;
    //    }else{
    //     rr = (4+3) & rr;
    //    }     
    //    qq = (rr&rr) + pp;
    //    if(pp > rr){
    //     pp = pp&pp;
    //    }    
    
    
    
    // System.out.println(pp+qq+rr);
    
    
    
    
    
    
    
    
    
    
    
    
       //    for(int i = 4; i<6; i++){
    //     if ((pp & rr) <(10-pp)) {
    //         break;
    //     }

    //     pp = 1 & qq;
    //     qq = (11+6) + rr;
    //    }

    //    System.out.println(pp+qq);

        
    }
}