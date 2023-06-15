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
public class The_isEmpty_operation {
   private int intArray[];
   private int front;
   private int rear;
   private int itemCount;
   private int MAX;
   The_isEmpty_operation(int size) {
      intArray = new int[size];
      front = 0;
      rear = -1;
      MAX = size;
      itemCount = 0;
   }
   public boolean isEmpty() {
      return itemCount == 0;
   }
   public static void main (String[] args) {
      The_isEmpty_operation q = new The_isEmpty_operation(5);
      System.out.println("Stack Empty? " + q.isEmpty());
   }
}