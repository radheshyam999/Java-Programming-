package exceptionhandling;

public class MyExceptionTwo {
    static ArithmeticException e = new ArithmeticException();
    
    public static void main(String[] args) {
        System.out.println("Throwing an exception ");
        throw e;

    }


}
