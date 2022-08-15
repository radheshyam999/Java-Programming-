package ds;

import java.util.ArrayList;

public final class MyLinkedList<T> 
{
    private Node<T> head = null;
    private int size = 0;
    public MyLinkedList(Object value) {
    }
    public MyLinkedList() {
    }

     class Node<T>{
        T value;
        Node <T>next; 
        Node(T value){
            this.value = value;
            next = null;
        }
    }    

        
    public void addAtLast(T value)
    {
        if(head == null){
        head = new Node<T>(value);
        size++;
        }else
        {
            Node<T> temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new Node<T>(value);    
            size++;
        }

    }
    public void addAtBegening(T value )
    {
        if(head == null){
            head = new Node<T>(value);
        }else{
            Node<T> p = new Node<T>(value);
            p.next = head;
            head = p;
            size++;
        }
    }
    public void insert(T value, int index)
    {
        if(head == null){
            head  = new Node<T>(value);
        }else{
            Node<T> temp = head;
            int count  = 0;
            while(temp.next != null && count < index )
                temp = temp.next;
            
            Node<T> p  = new Node<T>(value);
            p.next = temp.next;
            temp.next = p;
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
        if(node.next== null) return;
        reverseIt(node.next);
        

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
