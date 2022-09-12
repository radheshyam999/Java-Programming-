package multiThreading;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CharCost{
    char a;
    int valA;
    char b;
    int valB;
}





// static int solve(int x , int[] arr ){
//     int sum = 0;
//     int n = arr.length;
//     int largestDivisible = -1,
//         minimum = arr[0];
//     for (int i = 0; i < n; i++){
//         sum += arr[i];
//         if (arr[i] % x == 0 &&
//             largestDivisible < arr[i])
//             largestDivisible = arr[i];
 
//         if (arr[i] < minimum)
//             minimum = arr[i];
//         }
//         if (largestDivisible == -1) return sum;
//         int sumAfterOperation = sum - minimum - largestDivisible +
//                             (x * minimum) + (largestDivisible / x); 
//     return Math.min(sum, sumAfterOperation);
// }

static boolean  isItBranchable(int n){
    for (int i = 2; i <=n && n % 2 == 0; i++) {
        if(n % i == 0) return true;
        
    }
    return false;
}

static int solve(int n){
TreeSet ts =  new TreeSet<>();
for(int i = 2; i <=n/2; i++){
    if(n % i == 0){
         if(isItBranchable(n/i)){
            ts.add(n/i);
         }
    }
}


return ts.size();
}


static int kthSmallest(int arr[], int l, int r, int k)
    {
        //Comparator
        java.util.OptionalInt op = //Arrays.asList(arr).parallelStream().sorted().limit(k).max((a b)-> Integer.compare(a, b));

        Arrays.stream(arr).sorted().limit(k).max();
        System.out.println(op.getAsInt());
        return op.getAsInt();
        
    }




    static boolean areBracketsBalanced(String expr)
    {
        
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }


// int arr[] = { 5, -1, 5, 5, 6 };
    // int x = 3;
    // System.out.println(solve(10));

    //kthSmallest(new int[]{55,66,222,9,2,1,89}, 1, 1, 6);
    // Scanner sc  = new Scanner(System.in);
    // String line = sc.nextLine();
    // char c[] = line.toCharArray();
    // for (int i = 0; i < c.length; i++) {
    //         if((c[i] >='a' && c[i] <='z') && i%2 == 0 ){
    //                c[i] =  Character.toUpperCase(c[i]);
    //         }
    // }
    // System.out.println(new String(c));

int calculate(int []arr, int index){
    int calcu = 1;
    for(int i = 0; i<arr.length; i++){
        if(index != i)
            calcu *= arr[i]; 
        
    }
    return calcu;    
}
static int[] ProductArray(int []arr)throws java.lang.Exception{
    // write your code here;
    int []A = new int[arr.length];
    int calcu = 1;  
    //int m = 0  
    for(int j = 0; j< arr.length; j++){
        calcu = 1;    
        for(int i = 0; i<arr.length; i++){
                if(j != i)
                    calcu *= arr[i];  
            }
            A[j] = calcu; 
        }    
    return A;
}

public static class Question {



    static int TotalCost(CharCost [] chars) throws java.lang.Exception{
        if (chars == null) {
            return -1;
        }
        int sum  = 0; 
            for (int i = 0; i < chars.length; i++) {
                  
                if (chars[i].a > chars[i].b)
                    sum  += chars[i].valA;    
                else if(chars[i].a < chars[i].b)
                    sum  += chars[i].valB;
            }            
return  sum;

    }




public static void main(String[] args){
// {  int a[] = {2,3,1,2,3};
//     int i = (int) Arrays.stream(a).
//     System.out.println(i);
        // int valueN[] = {5,10,15,40};
        // int valueM[] = {2,3,20};
        // LinkedList ls = new LinkedList<>();
        // //ls.stream().
        // List<int[]> la = Arrays.asList(valueM,valueN).stream().sorted().collect(Collectors.toList());
        


    ////////////////// your other code is written here 
    
    //System.out.println(areBracketsBalanced(line));

    
    // char var1  = 'a';
    // char var2  = 'C';
    // System.out.println((int)var1 + "  " +  (int)var2);
//     int A[] = ProductArray(new int[]{2,3,7,5});
// for (int i : A) {
//     System.out.print(i + " ");
// }



    
}
    
}}



