package exceptionhandling;

public class TooYoungException extends RuntimeException {
    public TooYoungException(String message){
            super(message);
    }
    
}
