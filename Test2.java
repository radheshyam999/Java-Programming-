public class Test2 {
// to get the number reversed 
static int reverseNumber(int number){
    int n  = number;
StringBuilder sb  = new StringBuilder();
    while (n > 1) 
    {
        sb.append(n % 10);
        n /=10;
    }
return Integer.parseInt(sb.toString());
}
//  to get fibonnic number
static void getFibonaci(int n){
int firstTerm = 0, SecondTerm = 1 , tem = 0; 
while (SecondTerm <= n) {
    System.out.println(SecondTerm);
    tem = SecondTerm;
    SecondTerm += firstTerm;
    firstTerm = tem;
    
}
}
// check if given String is palandrom or not 
static boolean isPlandrom(String s){
int len  = s.length()-1;
int index = len;
for(int i = 0; i < len/2; i++) {
if(s.charAt(i) != s.charAt(index--)) return false;        
}
return true;
}

// add two multidimensional array
static void add(int [][] a, int [][]b){
int c[][] = new int[a.length][a.length]; 
for (int i = 0; i < b.length; i++) {
for (int j = 0; j < b.length; j++) {
    c[i][j] = a[i][j] + b[i][j];  
}
}

for (int i = 0; i < c.length; i++) {
for (int j = 0; j < c.length; j++) {
    System.out.print(c[i][j]);
}
System.out.println();
}

}
// check is it armstrong number or not 
static int getPower( int value,int powerIt){
int power   = 1; 
for (int i = 0; i < powerIt; i++) {
    power *= value;
}
return power;
}
static boolean isArmstrongNumber(int number){
int n  = number;
int powerCountIt = 0; 
int sumIt = 0;
while (n > 1) {
powerCountIt++;
}
n   = number;
while (n > 1) {
sumIt += getPower(n % 10,powerCountIt);
n /= 10;
}
if (sumIt == number) {
return true;
}
return false;
}
// check waether given Year is Leap year or not
static void leapYear(int year){
if(year % 4 == 0 || year % 400 == 0){
    System.out.println("Yes");
}else{
System.out.println("no");
}
}
//find non Repeating charcater

static void getNonRepeatingCharcater(String s){
    StringBuilder sb = new StringBuilder();
    boolean isUnique = true;
    for (int i = 0; i < s.length(); i++) {
        isUnique = true;
        for (int j = 0; j < s.length(); j++) {
            if( i != j && s.charAt(i) == s.charAt(j)){
                isUnique = false;   
                break; 

            }
        }
        if(isUnique == true){
            sb.append(s.charAt(i));
        }
    }
    
        System.out.println(sb);
}
 //  count frequency of charcater  
 static void countFrequency(String s){
    StringBuilder sb  = new StringBuilder(s);
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        count  = 0;
        for (int j = i+1; j < s.length(); j++) {
            if((sb.charAt(i)!='0' && sb.charAt(j)!='0') && (sb.charAt(i) == sb.charAt(j))){
                count++;
                sb.setCharAt(j, '0');
            }
        }
        System.out.println(sb.charAt(i) + " " + count);
        sb.setCharAt(i, '0');
    }
 }


public static void main(String[] args) {
    
//System.out.println(reverseNumber(310));
//getFibonaci(5);      
//System.out.println(isPlandrom("abc"));    
getNonRepeatingCharcater("abca");


}



    
}
