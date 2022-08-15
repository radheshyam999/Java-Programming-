package lf;

public class ArrayPrograme {
    
byte[] b  = new byte[5];
short s[] = new short[5];
int []a   = new int[5];
char c[]  = new char[5];
float f[] = new float[5];
double d[] = new double[5];
String str[] = new String[5];
boolean bool[] = new boolean[5];
 
void printClassOfArray(){
    System.out.println(b.getClass().getName());
    System.out.println(s.getClass().getName());
    System.out.println(a.getClass().getName());
    System.out.println(c.getClass().getName());
    System.out.println(f.getClass().getName());
    System.out.println(d.getClass().getName());
    System.out.println(str.getClass().getName());
    System.out.println(bool.getClass().getName());
}
    
    
    
    
    public static void main(String[] args) {

/**
        int[][][] k;

        int [][][]a;

        int b[][][];

        int[] [][]c;

        int u[] [][]; //All are valid.(10 ways)


        int[] []e[];

        int[][] []f;

        int[][] g[];

        int []h[][];

        int [][]i[]; 
 */

//new ArrayPrograme().printClassOfArray();

int[][] a = new int[2][];  
a[0]        = new int[3];
a[1]     = new int[1];
a[2]     = new int[2];


}

}