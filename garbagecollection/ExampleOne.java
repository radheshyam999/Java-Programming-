package garbagecollection;

public class ExampleOne {
    ExampleOne i;
public static void main(String[] args) {
    ExampleOne t1 = new ExampleOne();
    ExampleOne t2 = new ExampleOne();
    ExampleOne t3 = new ExampleOne();
    t1.i = t2;
    t2.i = t3;
    t3.i = t1;
    t1 = null;
    t2 = null;
    t3 = null;

}    
}
