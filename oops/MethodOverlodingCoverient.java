package oops;


class InnerMethodOverlodingCoverient {


Object s(Object x){
    System.out.println("Im Object coverinet " + x);
 return x;   
} 
String s(String m){
    System.out.println("Im string coverinet " + m);
    return m;   
   } 



}



public class MethodOverlodingCoverient extends InnerMethodOverlodingCoverient {
        Void s(Object s){
        return new Void(){
            {
            System.out.println("i am instance");
            }
        };
        }
    public static void main(String[] args) {
        InnerMethodOverlodingCoverient ob = new InnerMethodOverlodingCoverient();
        ob.s("Radhey");
        ob.s(10);

    }
    
}
