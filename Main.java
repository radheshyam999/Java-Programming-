// import static java.lang.System.out;


// //import static java.io.PrintStream;

// /**
//  * Main
//  */
// public abstract class Main {
//     Main(){
//         System.out.println("i m  interface");
//         System.out.println(this.hashCode());
//     }
//     {
//         System.out.println(this.hashCode());

//     }

// static{
    
//     System.out.println("i m static block");
// }
//     // public static void main(String[] args) {
        
//     //     out.print("Hello world!");
//     // }
// }
// /**
//  * InnerMain
//  */

//  class InnerMain  extends Main{

//     InnerMain(){
//         super();
//         System.out.println("Child class constr" + this.hashCode());
//     }
//    public static void main(String[] args) {
//             new InnerMain();
//    }
   
   import java.util.*;

class A {
   static void permutations(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> nums, int l, int h) {
       if (l == h) {
           ArrayList<Integer> nums1 = new ArrayList<Integer>(nums);
           res.add(nums1);
           return;
       }
       for (int i = l; i <= h; i++) {
           int left = nums.get(l);
           nums.set(l, nums.get(i));
           nums.set(i, left);
           permutations(res, nums, l + 1, h);
           left = nums.get(l);
           nums.set(l, nums.get(i));
           nums.set(i, left);
       }
   }
   static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer> >();
       int x = nums.size() - 1;
       permutations(res, nums, 0, x);
       return res;
   }

   public static void main(String[] args) {
    //    ArrayList<Integer> nums = new ArrayList<Integer>();
    //    nums.add(1);
    //    nums.add(2);
    //    nums.add(4);
    //    ArrayList<ArrayList<Integer>> res = permute(nums);
    //    Set<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();

    //    for (int i=0;i<res.size();i++){
    //        hs.add(res.get(i));
    //    }
    //    System.out.println("There are " + hs.size() + "possible permutations");
    //    System.out.println(hs);
       
       //res.forEach(System.out::println);
      
       System.out.println("Number of count subarra"+ countSubarray(4, new int[]{1,1,1,2}));



   }










static long countSubarray(int n,  int[]a){
    int count = 0;
    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
        nums.add(a[i]);
    }
    ArrayList<ArrayList<Integer>> res = permute(nums);
       Set<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
       for (int i=0;i<res.size();i++){
           hs.add(res.get(i));
       }
      int multi = 0;
    for (ArrayList<Integer> arr : hs) {
        for (int i = 0; i < arr.size()-1; i++) {
            multi = arr.get(i);
            for (int j = i+1; j < arr.size(); j++) {
                multi *= arr.get(j);
                if(multi % 2 != 0){
                    count++;
                    break;
                }
            }
        }
    } 
    
return count;
}







}








    
// }


