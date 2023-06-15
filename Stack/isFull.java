/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author DO KHANH TOAN
 */

    import java.io.*;
public class isFull {
   private int arr[];
   private int top;
   private int capacity;
   isFull(int size) {
      arr = new int[size];
      capacity = size;
      top = -1;
   }
   public boolean isEmpty() {
      return top == -1;
   }
   public boolean isFull() {
      return top == capacity - 1;
   }
   public void push(int key) {
      if (isFull()) {
         System.out.println("Stack is Full\n");
         return;
      }
      arr[++top] = key;
   }
   public static void main (String[] args) {
      isFull stk = new isFull(5);
      stk.push(1); // inserting 1 in the stack
      stk.push(2);
      stk.push(3);
      stk.push(4);
      stk.push(5);
      System.out.println("Stack Full? " + stk.isFull());
   }
}