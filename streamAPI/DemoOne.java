package streamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOne {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner scn  = new Scanner(System.in);

        for(int i = 0; i  < 10; i++){
            al.add(scn.nextInt());
        }
        //List<Integer> li = al.stream().filter(I-> I%2 == 0).collect(Collectors.toList());
        //List<Integer> li =  al.stream().map(I->I*2).collect(Collectors.toList());
        //long li = al.stream().filter(I-> I % 5 == 0 && I % 7 == 0).count();
        //Integer li = al.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        //Integer li = al.stream().max((o1, o2) -> o1.compareTo(o2)).get(); 
        //System.out.println(li);
        //al.stream().forEach(i->System.out.print(i));
        //al.stream().forEach(System.out::print); //  we are using Double colon Operator 
        Object[] a = al.stream().toArray();
        for (Object object : a) {
            System.out.print(object);
            
        }


        Integer[]  Array = al.stream().toArray(Integer[]::new);


    }
    
}


/**
1 public Stream filter(Predicate<T> t) t)

    If we want to filter elements from the collection then we should go for filtering. 
     we can configure Filter by using filter() method of stream Interface.
     public Stream filter(Predicate<T> t) t)
        t can be boolen valued function or lamda expression
        
        
        Ex: Collection c
        Stream st  =  c.stream().filter(i -> i % 2 == 0)   

2 public Stream map(Function<T,R> f)
    if we want to a separate new Object Present in the collection basedon some function then we should go for
    maping mechnism
    
    we can iplement mapping java method from Stream  interface 
    
Stream st =  al.stream().map(I->I*2);;

2 public long count() 
    processing by count() method:
    this method returns the number of elements present in stream

3 Processing by sorted() method:
    we can use sorted method to sort elements inside stream.
    we can sort either based on default natuaral sorting order or based 
    on our own Csutomized Sorting order 
   specifed by comparter object

    There are two method avalibale for sorting 
    
    sorted() :- Default natural sorting order 
    sorted(Compartor c):- Customize sorting order based on your logic 

4-processing by min() and max() methods:
5 min(Comparator c)
    Returns minimum value according to specified to comparator        
 

6 max(Comparator c):
        Returns max value according to specified to comparator
7 forEach(): Processing by using forEach() method:
    this method won't return anything 
    this method can take lambda  epression 
    for each element present in stream.
toArray(): Processing by toArray() method

we can use toArray()method to copy
Elements present in the Stream into specified array.
eg:
    ArrayList<Integer> l = new


Stream.of() method:
    we can also apply stream for group of & arrays 

For Group of Values:

Stream<Integer> s = Stream.of(9999,888,66,77,25,45,32,10,62);


for Double:
    doubel[] d = {10.5,50.6,30.989,54.123,89.654};

    */

