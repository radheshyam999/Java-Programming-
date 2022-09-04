package exceptionhandling;

public class MyExceptionThree {
    
    static ArithmeticException e;
    
    public static void main(String[] args) {
        System.out.println("Throwing an Exception");
        throw e;
    }
    
}
