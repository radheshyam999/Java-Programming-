package exceptionhandling;

public class MyExceptionOne {
    public static void main(String[] args) {
        System.out.println("statment first started here");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            //TODO: handle exception

            e.printStackTrace();
            System.out.println(e);
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
        }
    
    
    }



    
}
