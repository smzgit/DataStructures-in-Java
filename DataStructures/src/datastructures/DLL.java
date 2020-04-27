/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

public class DLL {

    class Node{
    int data;
    Node prev,next ;
    }
    Node start,tail ;
    
    DLL(){
    start = null;
    tail = null;
    }
    
    void insert(int item){
    
        Node temp = new Node();
        temp.data = item ;
        
        if(start==null){
            start=temp;
            tail=temp ;
        }
        else{
            Node trav = start;
            while(trav.next != null){
                trav = trav.next ;
            }
            
            trav.next = temp ;
            temp.prev = trav ;
            tail = temp ;        
        }
        
    }
    
    void display(){
        Node p = start;
        while(p!=null){
            System.out.print(p.data+" -> ");
            p = p.next;
        }
        System.out.println("");
    }
    
    void reverse(){
        Node p = tail;
        while(p!=null){
            System.out.print(p.data+" -> ");
            p = p.prev;
        }
        System.out.println("");
    }
    
    void search(int num){
        int n = -1 ;
         Node p = start;
        while(p!=tail){
           if(p.data==num){
               System.out.println(num+" is present in the DLL");
               n=0;
           break;
           }
            p = p.next;
        }
        if(n==-1)
            System.out.println(num+" doesnt exists");
       
    }
    
    void delete(int ele){
        Node temp = start ;
         Node prev = temp;
       
        if(start.data==ele)
            start = start.next;
         if(tail.data==ele){
             System.out.println("tail it is !!!");
            tail = tail.prev;}
        else{
          temp = start.next ;
         prev = start;
        
         while(temp.data!=ele){
             temp = temp.next ;
             prev = prev.next ;
        }
        prev.next = temp.next ;
        temp.next.prev = prev ;
         }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DLL dll = new DLL() ;
        dll.insert(23);
        dll.insert(13);
        dll.insert(33);
        dll.insert(53);
        dll.insert(63);
        dll.insert(3);
        dll.insert(823);
        dll.insert(93);
        dll.insert(213);
        dll.insert(45);
        dll.insert(36);
        dll.insert(783);
        dll.insert(977);
        dll.insert(2013);
        
        dll.display();
      
        dll.reverse();
        
        dll.search(63);
        dll.search(64);
        
        System.out.println("deleting 213");
        dll.delete(213);
        System.out.println("\nLast data:\t"+dll.tail.data);
        System.out.println("\nComplete List");
        dll.display();
        System.out.println("\nComplete Reverse List");
        dll.reverse();
        
    }
    
}
