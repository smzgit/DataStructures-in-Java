/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

public class Stack_LL {
    Node top ;
    
    class Node{
        int data ;
        Node next ;
    }
    Stack_LL(){
        top = null ;
    }
    
    void push(int ele){
        Node temp = new Node();
        temp.data = ele ;
        temp.next = top ;
        top = temp ;
                
    }
    
    void pop(){
        if(top == null){
            System.out.println("No elements in the stack");
            return ;
        }
        top = top.next;
    }
    
    void peek(){
        System.out.print("Stack Top pointing : ");
        System.out.println(top.data);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Stack_LL stkLL = new Stack_LL();
       stkLL.push(12);
       stkLL.push(132);
       stkLL.push(14);
       stkLL.push(22);
       stkLL.push(52);
       stkLL.push(67);
       
        System.out.println(stkLL.top.data);
        stkLL.pop();
        
        System.out.println(stkLL.top.data);
        stkLL.pop();
        System.out.println(stkLL.top.data);
        stkLL.pop();
        
        stkLL.peek();
        
        
    }
    
}
