package multiThreading;

public class ThreadOne {

    public static void main(String[] args) {
        MyThreadOne childThread = new MyThreadOne();
        childThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("thread main");
        }
    }

}
