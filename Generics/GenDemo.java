package Generics;

public class GenDemo {
 
    public static void main(String[] args) {
        Gen<String> g  = new Gen<String>("durga");
        g.show();
        Gen<Integer> g1  = new Gen<Integer>(new Integer(10));
        g1.show();
        System.out.println(g1.getObject());

    }
}
