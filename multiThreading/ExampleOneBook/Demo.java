package multiThreading.ExampleOneBook;

public class Demo  {
    public static void main(String[] args) {
        Thread t  = Thread.currentThread();
        System.out.println(t.getPriority());
        t.setPriority(10);
        System.out.println(t.getPriority());
        System.out.println(t.getName());
        t.setName("radhey");
        System.out.println(t.getName());
    }
}
