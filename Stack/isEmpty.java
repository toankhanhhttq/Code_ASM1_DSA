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
import java.util.*; // util imports the stack class
public class isEmpty {
   public static void main (String[] args) {
      Stack<Integer> stk = new Stack<Integer>();
      
      // Inserting elements into the stack
      stk.push(52);
      stk.push(19);
      stk.push(33);
      stk.push(14);
      stk.push(6);
      System.out.println("Stack empty? "+ stk.isEmpty());
   }
}
