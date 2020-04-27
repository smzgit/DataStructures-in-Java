/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Hp
 */
public class Circular_LL {
    Node start ;

    class Node{
        int data;
        Node next;
    }
    Circular_LL(){
        start = null;
    }
    void Insertnode(int item) {
        
        Node temp = new Node() ;

        temp.data = item ;
   
        
        if(start==null){
           
        start = temp;
        temp.next = start;
       
        }
        else{
            Node traverse=start;
            while(traverse.next!=start){
            traverse = traverse.next ;
            }
        traverse.next = temp;
        temp.next = start;
   }
       
    
    }
    
    void Display(){
        Node p = start;
    while(p.next!=start){
       System.out.print(p.data+" -> ");
       p = p.next ;
     }
        System.out.print(p.data+"\n");
    }
    void search(int num){
    Node trav = start;
    String u = " is not present in the list" ;
    while(trav.next!=start){
            if(num==trav.data){
            u = " is present is the list";
            break;
            }
            trav = trav.next ;
      }
    System.out.println("\n"+num+u);
    }
    
    void delete_ele(int del_ele){
        Node trav = start.next;
        Node prev = start;
        String del = " not present !" ;
        if(start.data == del_ele){
            del = " Deleted successfully" ;
            Node p = start;
            while(p.next != start){
             p = p.next ;
             
          }
            p.next = start.next;
            start = start.next;
             
         
        }
        else{
        while(trav.data != del_ele){
            
            trav = trav.next;
            prev = prev.next ;
                    
          }
        if(trav.data==del_ele)del = " Deleted successfully" ;
        
        }
        prev.next = trav.next ;
        trav.next = prev.next ;
        System.out.println(del_ele+del);
    }
    
    public static void main(String[] args) {
        Circular_LL cll = new Circular_LL();
        cll.Insertnode(1);
        cll.Insertnode(2);
        cll.Insertnode(3);
        cll.Insertnode(4);
        cll.Insertnode(5);
        cll.Insertnode(6);
        cll.Insertnode(7);
        cll.Insertnode(8);
        cll.Insertnode(9);
        cll.Insertnode(10);
        cll.Insertnode(11);
        cll.Display();
        cll.search(34);
        cll.search(4);
        cll.delete_ele(9);
        cll.Display();
 
    }
    
}
