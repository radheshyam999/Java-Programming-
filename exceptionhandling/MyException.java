package exceptionhandling;

public class MyException {
    public static void main(String[] args) {
        System.out.println("statement one");
        try {
            System.out.println(10/0);

        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(10/0);
        }
        System.out.println("statment -2");
    }
}
