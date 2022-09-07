package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMap {
    
   class epm{
            String eId;
            String eName;
             int eSal;
        epm( String eId, String eName, int esal){
            this.eId = eId;
            this.eName = eName;
            this.eSal = eSal;
        }

    } 
    public static void main(String[] args) {
        List<String> li = Arrays.asList("abc","def","ghi","ABC");
        //List<String> ls = li.stream().map(ab-> ab.toUpperCase()).collect(Collectors.toList());
        DemoMap dm  = new DemoMap();
     
        //System.out.println(li);
       // System.out.println(ls);
        li.stream().map(a->a.length()).forEach(System.out::print);
        List<epm> epmlis = Arrays.asList(
            dm .new epm("123", "radhey", 1000000000),
            dm .new epm("123", "Rahul", 200000),
            dm .new epm("123", "ramit", 500000),
            dm .new epm("123", "soni", 90000000),
            dm .new epm("123", "mike", 400000),
            dm .new epm("123", "sunder", 600000),
            dm .new epm("123", "peter", 700000),
            dm .new epm("123", "robert", 50000)
        );
        
        List<Integer> lisalary  = epmlis.stream().filter(obemp-> obemp.eSal > 6000).map(obemp->obemp.eSal).collect(Collectors.toList());
        System.out.println(lisalary.isEmpty());
    
    
    }



}
