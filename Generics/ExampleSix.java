package Generics;

public class ExampleSix<T extends Object>{
public static void main(String[] args) {
    ExampleSix<Integer> i = new ExampleSix<Integer>();
    ExampleSix<String> s = new ExampleSix<String>(); 
}
public void bull(){
    T a,b;
    //System.out.println(a + b);
    //System.out.println(a - b);
    //System.out.println(a * b);
    //System.out.println(a / b);

}

}