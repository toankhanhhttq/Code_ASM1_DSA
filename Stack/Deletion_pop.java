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
import java.util.*; 

// util imports the stack class
public class Deletion_pop {
   public static void main (String[] args) {
      Stack<Integer> stk = new Stack<Integer>();
      
      // Inserting elements into the stack
      stk.push(52);
      stk.push(19);
      stk.push(33);
      stk.push(14);
      stk.push(6);
      System.out.print("The stack is: " + stk);
      
      // Deletion from the stack
      System.out.print("\nThe popped element is: ");
      Integer n = (Integer) stk.pop();
      System.out.print(n);
   }
}
