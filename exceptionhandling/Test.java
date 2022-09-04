package exceptionhandling;

public  class Test {
    public static void main(String[] args) {
        System.out.println("Exception handling started ");
            doStuff();
            System.out.println("Exception handling ended ");
    }

public static void doStuff(){
    doMoreStuff();
    System.out.println("this will not get excuted because exception occured ");
}    

public static void doMoreStuff(){
    System.out.println(10/0);
    System.out.println("hello world");
}

}
