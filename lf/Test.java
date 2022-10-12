package lf;

import java.util.ArrayList;

public class Test {

    static void invIsoTriangle(int N) {
       //StringBuilder sb = new StringBuilder();
       String[]sba = new String[N];
        char c[][] = new char[N][2*N]; 
        // code here*
        for(int i = 1; i <=N; i++){
            for(int j = 1; j < 2*N; j++){
                c[i-1][j-1] = (j >= i && j <= (2*N)-i )? '*': ' ';
                    
        }

        //sba[i-1] = sb;  
        System.out.println(); 
        
        
        
        
    }




    //char c[] = new char[N]; 
    // code here
    // for(int i = 1; i <=N; i++){
    //     for(int j = 0; j < (2*N) - 1; j++){
    //         System.out.print(c[i][j]);   
    //         } 
    //         System.out.println();  
    //     }
int l = 0;
for(char[] sbr:c){
    sba[l] = new String(sbr); 
    System.out.println(sba[l++]);
}





}
static void getMinMax(long a[], long n)  
     {   long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
        //pair p = new pair();
        //Write your code here
        for(int  i = 0; i < n; i++){
            if(max < a[i]) max = a[1];
            if(min > a[i]) min = a[i];
            
        }
        
    }

public static void main(String[] args) {
    invIsoTriangle(4);

    ArrayList al = new ArrayList<>();
    al.size();
}

}
