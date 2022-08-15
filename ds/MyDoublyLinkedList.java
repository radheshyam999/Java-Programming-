package ds;

import java.util.ArrayList;

public class MyDoublyLinkedList<T> {
    private Node<T>head,tail; 
    private int size;
    private class Node<T>{
        Node<T> next;
        Node<T> prev;
        T value;
        Node(T value){
            this.value = value;
            next  = null;
            prev = null;
            }

        }
    public void addAtLast(T value)
    {
    if(head == null){
        head = new Node<T>(value);
        tail = head;
        size++;
        }else
        {
            Node<T> temp = head;
            while(temp.next != null)
                temp = temp.next;
            Node<T> p = new Node<T>(value);
            p.prev = temp;
            temp.next = p;
            tail = p;     
            size++;
        }

    }
    public void addAtBegening(T value )
    {
        if(head == null){
            head = new Node<T>(value);
            tail = head;
        }else{
            Node<T> p = new Node<T>(value);
            p.next = head;
            head.prev = p;
            head = p;
            size++;
        }
    }
    public void insert(T value, int index)
    {
        if(head == null){
            head  = new Node<T>(value);
            tail = head;
        }else{
            Node<T> temp = head;
            int count  = 0;
            while(temp.next != null && count < index )
                temp = temp.next;

            Node<T> p  = new Node<T>(value);
            temp.next.prev = p;
            p.next = temp.next;
            temp.next  = p;
            p.prev = temp;    
            size++;
        }

    }
    public boolean  delete(T value)
    {
        Node<T> temp = head;
        while(temp.next != null)
        {
            if(temp.value == value)
            {
               temp.next = temp.next.next;     
               size--; 
               return true; 
            } 
            temp = temp.next;              
        }
        return false;
    }
    public boolean deleteAll()
    {
        head = null;
        size=0;
        return true;
    }
    public ArrayList<T> getArrayList(){
        ArrayList<T> al = new ArrayList<T>();
        Node <T>temp  = head;  
        while(temp.next != null)
        {
            al.add(temp.value);
            temp = temp.next;
        }
        return al;
    } 
    public void showElement(){
        Node<T> temp = head;
        while (temp.next != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        } 

    }
    //private Node<T>temp = head;
    private void reverseIt(Node<T> node){
        Node<T> n = head;
        head  = tail; 
        tail  = n;
    }
        




    public void reverse()
    {
            reverseIt(head);
    }
    public void sort()
    {

    }
    public boolean saerch(T value){
        Node<T> temp  =  head;
        while (temp.next != null) 
        {
            if(temp.value == value)
                return true;    
        }
        return false;
    }
    

}
