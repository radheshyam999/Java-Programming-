package exceptionhandling;

public class MyExceptionFive extends RuntimeException {
    
    public MyExceptionFive(String message){
        super(message);
    }
    
    
    public static void main(String[] args) {
        System.out.println("trying to creating custimize class of exception ");
        throw new MyExceptionFive("kindly get the message"); 
    }
    
}
