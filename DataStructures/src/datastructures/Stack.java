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
public class Stack {
    int top;
    int[] stack ;
    Stack(int size){
        top = -1;
        stack = new int[size] ;
    }
    
    void push(int num){
        top++;
        stack[top] = num;
    }
    
    void pop(){
        top-- ;
    }
    
    void display(){
        for (int i = top; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }
    
    int peek(){
        return stack[top] ;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Stack stk = new Stack(6) ;
        stk.push(12);
        stk.push(1);
        stk.push(13);
        stk.push(45);
        stk.push(13);
        stk.push(53);
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println("Stack top element is :"+stk.peek());
    }
    
}
