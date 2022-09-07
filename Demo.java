import java.io.File;
import java.io.OutputStream;
import java.math.BigInteger;
import java.time.Month;
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
    one:
    for (int a = 0; a < genrateCard.length; a++) {
        //sb.delete(0, 16);
        //b.append(4);
        //sb.append(a);
         two:   
        for (int b = 0;  b < genrateCard.length; b++) {
            three:
            //sb.append(b);
            for (int c = 0; c < genrateCard.length; c++){
                four:
                //sb.append(c);
                for (int d = 0; d < genrateCard.length; d++){
                    five:
                    //sb.append(d);
                    for (int e  = 0; e < genrateCard.length; e++){
                        //sb.append(e);
                        for (int f = 0; f < genrateCard.length; f++) {
                            six:
                            //sb.append(f);   
                            for (int g = 0;  g < genrateCard.length; g++) {
                                seven:
                                //sb.append(g);
                                for (int h = 0; h < genrateCard.length; h++){
                                    eight:
                                    //sb.append(h);
                                    for (int i = 0; i < genrateCard.length; i++){
                                        nine:
                                        //sb.append(i);
                                        for (int j  = 0; j < genrateCard.length; j++){
                                            ten:
                                            //sb.append(j);
                                            for (int k  = 0; k < genrateCard.length; k++){
                                                elven:
                                                //sb.append(k);
                                                for (int l = 0; l < genrateCard.length; l++) {
                                                    twelve:
                                                    //sb.append(l);   
                                                    for (int m = 0;  m < genrateCard.length; m++) {
                                                        thirteen:
                                                        //sb.append(m);
                                                        for (int n = 0; n < genrateCard.length; n++){
                                                                fourteen:
                                                                //sb.append(n);
                                                                for (int o = 0; o < genrateCard.length; o++){
                                                                    fifteen:
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
 
 
 
// method is going to end here 
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







    public static void main(String[] args) {
        //  Genratecard visaCards = (OutputStream op)->{
            
        //     new Demo().fifthedigitcard(op);
        //  };
        //  //visaCards.getCard(null); 
        //  Month[] m ={Month.JANUARY,Month.FEBRUARY,Month.MARCH,Month.APRIL, Month.MAY, Month.JUNE, Month.JULY,Month.AUGUST,Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER,Month.DECEMBER};
        //  for (Month month : m) {
        //     //System.out.println(month.length(isLeapYear(2022)));   
        //  }     
        //System.out.println(10%2==0 ?  "afvdvskfb" : "i am radhey");
        
        
        
    }
}