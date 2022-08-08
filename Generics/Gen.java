package Generics;

public class Gen<T> {
    T ob;
    Gen(){
        //this.ob = ob;
    }
    Gen(T ob){
        this.ob = ob;
    }
    public static void main(String[] args) {
        System.out.println(new Gen().getClass().getName());
    }
    
    public T getObject(){
        return ob;
    }
    public void show() {
    }
}
