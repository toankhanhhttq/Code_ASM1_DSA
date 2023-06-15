/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author DO KHANH TOAN
 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class Heaptraversal {

    public static void main(String[] args) {
        // Create a priority queue.
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements to the priority queue.
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Traverse the priority queue.
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}