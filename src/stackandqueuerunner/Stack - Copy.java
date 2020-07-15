/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueuerunner;

/**
 *
 * @author GATHERU
 */
public class Stack {
    int top =0;
    int[] stack = new int[4];
    public void push(int data){
        if(top==4){
            System.out.println("Stack is full");
        }else{
        stack[top]=data;
        top++;
        }
        
    }
    public int  pop(){
    int data=0;
    if(top==0){
        System.out.println("Stack is empty");
    }else{
     top --;
    data=stack[top];
    stack[top]=0;
    
    }
   return data;
    }
    public void show(){
        System.out.print("Stack elements: ");
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println("");
    }
}
