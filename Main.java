import static java.lang.System.out;


//import static java.io.PrintStream;

/**
 * Main
 */
public abstract class Main {
    Main(){
        System.out.println("i m  interface");
        System.out.println(this.hashCode());
    }
    {
        System.out.println(this.hashCode());

    }

static{
    
    System.out.println("i m static block");
}
    // public static void main(String[] args) {
        
    //     out.print("Hello world!");
    // }
}
/**
 * InnerMain
 */

 class InnerMain  extends Main{

    InnerMain(){
        super();
        System.out.println("Child class constr" + this.hashCode());
    }
   public static void main(String[] args) {
            new InnerMain();
   } 
    
}


