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
public class Queue {

    int front,rear ;
    int[] arr;
    Queue(int size){
    front = 0; rear = -1 ;
    arr = new int[size] ;
    }
    
    void enque(int num){
        if(rear==arr.length-1){
            System.out.println("Queue is full !!!");
            return ;
        }
        rear++ ;
        arr[rear] = num ;
    }
    void denque(){
        front++;
    }
    
    boolean isEmpty(){
        if(rear==-1){
        return true ;
        }
        else
            return false ;
    }
    public static void main(String[] args) {
      Queue q = new Queue(10) ;
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
      System.out.println("First Element is : "+q.arr[q.front]);
      q.denque();
      q.denque();
      q.denque(); 
      System.out.println("After dequeuing 3 times:");
      System.out.println("First Element is : "+q.arr[q.front]);
    }
    
}
