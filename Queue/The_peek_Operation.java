/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author DO KHANH TOAN
 */

 import java.util.LinkedList;
import java.util.Queue;
public class The_peek_Operation {
   public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
      q.add(6);
      q.add(1);
      q.add(8);
      q.add(4);
      q.add(7);
      System.out.println("The queue is: " + q);
   }
}