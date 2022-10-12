package problemSloving;

import java.util.Scanner;

/**
 * 35) nth Prime Number Java
 */
public class ThirtyFive {



    static CheckPrime chkprime = (n)->{
        if(n == 2) return true;
        int i = 2;
        while (i < (int)Math.sqrt(n)+1) 
            if(n % i == 0) return false;
        return true;
    };
    public static void main(String[] args)
     {
        Scanner scan  = new Scanner(System.in);
        int i  = 1, count = 0, ithPrime = scan.nextInt();     
        while (count < ithPrime)
        {   i++;
            if(chkprime.isPrime(i)){ count++;
                //System.out.println(i);
            }
            
        }
       System.out.println(i);
        scan.close();
    }

    
}

