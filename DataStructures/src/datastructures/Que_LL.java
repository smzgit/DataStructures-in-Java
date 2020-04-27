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
public class Que_LL {
    
    Node front,rear;

    class Node{
    int data ;
    Node next ;
    }
    Que_LL(){
    front=rear=null;
    }
    void enque(int num){
        Node temp = new Node();
        temp.data = num ;
        if(rear==null){
            rear = temp;
            front=temp ;
        }
        else{
            
            rear.next=temp;
            rear = temp ;
        }
        
    }
    void denque(){
        front = front.next;
    }
    
    boolean isEmpty(){
        if(front==rear){
        return true ;
        }
        else
            return false ;
    }
    public static void main(String[] args) {
        Que_LL q = new Que_LL() ;
        System.out.println("Queue is Empty ? : "+q.isEmpty());
      q.enque(12);
      q.enque(24);
      q.enque(36);
      q.enque(48);
      q.enque(60);
      q.enque(72);
      q.enque(84);
      q.enque(96);
      q.enque(108);      
      System.out.println("Queue is Empty ? : "+q.isEmpty());
      q.enque(120);
      q.enque(132);
      System.out.println("First Element is : "+q.front.data);
      q.denque();
      q.denque();
      q.denque(); 
      System.out.println("After dequeuing 3 times:");
      System.out.println("First Element is : "+q.front.data);
       System.out.println("Latest Element is : "+q.rear.data);
    }
    
}
