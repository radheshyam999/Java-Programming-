package lf;
public class DataType{
/***
 * reperstation of hexdecmial number  and octal numebre
 * 
 * 
 * 
 */


public static void main(String[] args) {
    /**
    int a = 0777; //(valid)
    int x  = 076; //C.E:integer number too large: 0786(invalid)
    int y = 0xFACE; //(valid)
    int z = 0xbeef; //(valid)
   int s =0xBeec; //C.E:';' expected(invalid) //:int x=0xBeer; ^// ^
   int t =0xabb2cd;//(valid)
   //int sum  =  52l;
    System.out.println(a);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(s);
    System.out.println(t);
 */

 /**

R&D on Double 

float f = 123.456f;  C.E:possible loss of precision(invalid)
float k = 123.456D;  C.E:possible loss of precision(invalid)
double d = 0x123.456;  C.E:malformed floating point literal(invalid)
double m = 0xFace;  (valid)
double d = 0xBeef;  (valid)
 
*/
/** 



char ch ='a';    (valid)
char ch = a;     C.E:cannot find symbol(invalid)
char ch = "a";   C.E:incompatible types(invalid)
char ch = 'ab';  C.E:unclosed character literal(invalid)

*/




/** 
"\n" how does it work tried to Demonstrat it here 


System.out.print("hello \n");
System.out.print("hello");
System.out.print("hello \n");

*/

/** 
Here tried to Demonstrate how does it work 
System.out.print("hello \t");
System.out.print("hello \t");
System.out.print("hello ");

*/

/** 
System.out.print("hello \r");
System.out.print("hello \r");
System.out.print("hello ");

*/

System.out.println("hello \f");
System.out.println("hello \f");
System.out.println("hello ");

System.out.println("hello \b");
System.out.println("hello \'");
System.out.println("hello \"");
System.out.println("hello \\");


}



}