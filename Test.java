import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

        //  ProcessHandle p=ProcessHandle.current();  
        //  long pid=p.pid(); 
        //  System.out.println("The PID of current running JVM instance :"+pid);  
        //  Thread.sleep(100000);  

        // ProcessHandle p=ProcessHandle.current(); 
        //  ProcessHandle.Info info=p.info(); 
        //  System.out.println("Complete Process Inforamtion:\n"+info); 
        //  System.out.println("User: "+info.user().get()); 
        //  System.out.println("Command: "+info.command().get()); 
        //  System.out.println("Start Time: "+info.startInstant().get()); 
        //  System.out.println("Total CPU Time Acquired: "+info.totalCpuDuration().get());

      //   Optional<ProcessHandle> opt=ProcessHandle.of(7532); 
      //   ProcessHandle p=opt.get();
      //   ProcessHandle.Info info=p.info(); 
      //   System.out.println("Complete Process Inforamtion:\n"+info); 
      //   System.out.println("User: "+info.user().get());
      //   System.out.println("Command: "+info.command().get()); 
      //   System.out.println("Start Time: "+info.startInstant().get());
      //   System.out.println("Total CPU Time Acquired: "+info.totalCpuDuration().get());







public class Test  {
   static int power(int x,int pow){
      int multi = 1;
       for(int  i = 0; i < pow; i++){
         multi *= x; 
       }  
       return multi;
   }
   static boolean isArmstrongNumber(int n){
      int n2  = n;
      ArrayList<Integer> al  = new ArrayList<>();   
      int count = 0;
      while(n > 1){
         al.add(n % 10);
         n /= 10;
         count++;
      }
      int sum  = 0;
      for(int i = 0; i < count; i++){
            sum += power(al.get(i),count);
      }
      if(sum == n2) return true;
      
      return false;
   }  
   
   // second problem 

  static void printAllunq(int ...a){
         HashSet<Integer> hs = new HashSet<>();
         for (int i : a) {
            hs.add(i);
         }
         System.out.println("---------------");
         System.out.println("it is set");
         System.out.println(hs);
   }

static void getTheValueatIandJlocation(int a[][], int i,int j){
   System.out.println(a[i][j]);
}
   
void getTheTarget(int target){
/* 
   111
   12
   21
*/
   
   
   
   
   int sum  = 1;
   int  j = 1;
   for (int i = 1; i < target; i++) {
         
      while (true) {
         if(sum >= target){
            break;
         }else{
            sum = 0;   
         }   
         }
            
      }
   }




   
   
   

   
   public static void main(String[] args) throws Exception { 
           System.out.println(isArmstrongNumber(121)? "it is armstrong number" : "it is not an armstrong number");
           printAllunq(1,2,3,5,+6,8,5,9,87);
           

           System.out.println("___________________________________________");
           System.out.println("Question Number Third");
           int a[][] = {{1,2},{45}};
           
           getTheValueatIandJlocation( a,  0,1);

      






        } 
     } 