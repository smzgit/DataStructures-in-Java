/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;
import java.io.* ;

public class LinkedList {

    class Node{
    int data ;
    Node next =null;
    }
    Node Start;
    LinkedList(){
    Start = null ;}
    
    void Insertnode(int item) {
        
        Node temp = new Node() ;

        temp.data = item ;
   
        
        if(Start==null){
           
        Start = temp;
       
        }
        else{
            Node traverse=Start;
            while(traverse.next!=null){
            traverse = traverse.next ;
            }
        traverse.next = temp;
   }
       
    
    }
    
    void Display(){
        Node p = Start;
    while(p!=null){
        System.out.print(p.data+" -> ");
       p = p.next ;
    
     }
    }
    void search(int num){
    Node trav = Start;
    String u = " is not present in the list" ;
    while(trav.next!=null){
            if(num==trav.data){
            u = " is present is the list";
            break;
            }
            trav = trav.next ;
      }
    System.out.println("\n"+num+u);
    }
    
    void delete_ele(int del_ele){
        Node trav = Start.next;
        Node prev = Start;
        String del = " not present !" ;
        if(Start.data == del_ele){
            del = " Deleted successfully" ;
        Start = Start.next ;
        }
        else{
        while(trav.data != del_ele){
            trav = trav.next;
            prev = prev.next ;
           
            del = " Deleted successfully" ;
          }
        }
        prev.next = trav.next ;
       // trav.next = prev.next ;
        System.out.println(del_ele+del);
    }
    
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        // TODO code application logic here
        LinkedList lk = new LinkedList();
       int x ;
       int ch = 1;
       int serch_ele;
       int goOn=1;
       do{
           System.out.println("1. Add elements to the list\n2. Display\n3. Search \n4.Delete element");
           int opt = Integer.parseInt(br.readLine());
       switch(opt){
           case 1:{
               while(ch==1){
           System.out.println("Enter the value in the linked list");
           x = Integer.parseInt(br.readLine());
           lk.Insertnode(x);
           System.out.println("Continue??Yes = 1/No = 0");
           ch = Integer.parseInt(br.readLine());
       }
               break;
           }
           case 2:{
           lk.Display();
           break;}
           
           case 3:{
          serch_ele = Integer.parseInt(br.readLine());
          lk.search(serch_ele);
           break;}
           
           case 4:{
           int del = Integer.parseInt(br.readLine());
           lk.delete_ele(del);
           }
           
       }
       System.out.println("Continue? Yes=1/No=0");
       goOn = Integer.parseInt(br.readLine());
       }while(goOn==1) ;
          
   
    }
    
}
