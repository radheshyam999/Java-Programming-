package garbagecollection;

public class ExamapleTwo {

    public static void main(String[] args) {
        String s = new String("durga");
        //ExamapleTwo s = new ExamapleTwo();
        s = null;
        System.gc();

    }
    @Override
public void finalize(){
System.out.println("djwedjowidjoiwjdiwejdie");
}

}

