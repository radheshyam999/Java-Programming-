package multiThreading;

import java.util.ArrayList;

class Source {
    
    public ArrayList<String> changeOccurrence(ArrayList<String> a, String m, String n){
        
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).equals(m)){
                    a.set(i, n);    
                }
            }

        return a;

    }

public String listIndex(ArrayList<String> list){

    return list.get(0);
}

    
public ArrayList<String> listAfter(ArrayList<String> list , String m, String n){
    for (int i = 0; i < list.size(); i++) {
        if(list.get(i).equals(m)){
            list.add(i+1, n);    
        }
    }
    return list;
}


    public static void main(String[] args) {
            
        Source obj  = new Source();
        ArrayList<String> ls  = new ArrayList<>();
        ls.add("A");
        ls.add("B");
        ls.add("S");
        ls.add("D");
ArrayList<String> temp = obj.changeOccurrence(ls, "S", "C");
System.out.println(temp);
  System.out.println(obj.listIndex(ls));
temp = obj.listAfter(ls, "D", "E");
System.out.println(temp);   
    }
}
