package org.example.Head03_OOP.example28;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
