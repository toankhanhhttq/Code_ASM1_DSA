/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author DO KHANH TOAN
 */

import java.io.*;
public class The_isFull_Operation {
   private int intArray[];
   private int front;
   private int rear;
   private int itemCount;
   private int MAX;
   The_isFull_Operation(int size) {
      intArray = new int[size];
      front = 0;
      rear = -1;
      MAX = size;
      itemCount = 0;
   }
   public boolean isFull() {
      return itemCount == MAX;
   }
   public void insert(int key) {
      if(!isFull()) {
         if(rear == MAX-1) {
            rear = -1;
         }
         intArray[++rear] = key;
         itemCount++;
      }
   }
   public static void main (String[] args) {
      The_isFull_Operation q = new The_isFull_Operation(5);
      q.insert(1); // inserting 1 in the stack
      q.insert(2);
      q.insert(3);
      q.insert(4);
      q.insert(5);
      System.out.println("Stack Full? " + q.isFull());
   }
}