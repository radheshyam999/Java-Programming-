public class Assginment {
    interface GetMaxhelper{
        int max(int... arr);
    }
    
    
    
    public static void main(String[] args) {
       //System.out.println(); 
       int x  = 8; 
       //byte b  = (byte)x;
       x = x<<2;
       System.out.println(x);//1000 // 0111 +1 = 1000
       
       


       //getFrequncy(9,8,7,8,4,3,9,9,9);
    }
    
//Java Program to copy all elements of one array into another array

static int [] copyArray(int [] a){
    int len  = a.length;
    int b[] = new int[len];
    for(int i = 0; i< a.length; i++){
        b[i] = a[i]; 
    }
return b;
}

// 2) Java Program to find the frequency of each element in the array

// int max(int a, int b){
//     return 
// }


static void getFrequncy(int...arr){
    int len=  arr.length;
    GetMaxhelper help = (m)->{
        int mx = 0;
        for(int i = 0; i < len; i++)
            if(mx < m[i]) mx = m[i];     
    
            
    return mx;}; //a > b? a:b;
    int max = help.max(arr);
    int A[] = new int[max+1];    
    for(int i = 0; i < len; i++){
        for(int j = i+1; j < len; j++){
            if(arr[i] == arr[j])
                A[arr[i]] = A[arr[i]]+1;
               
    }
}

for(int  i = 0; i < max; i++){
    if(A[i] != 0)
    {
        System.out.println("value:" + i + " \n Nmberof count" + A[i]);
    } 
    
    // "value :"+ i + "NumberOftime" +A[i]:"");   
}

}





}
