package org.example.Head03_OOP.example28;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> oldStack = new Stack<>();
        oldStack.push(1);
        oldStack.push(2);
        System.out.println("[oldStack] 결과");
        int firstPop = oldStack.pop();
        System.out.println("oldStack 첫번째 pop: " + firstPop);
        int secondPeek = oldStack.peek();
        System.out.println(secondPeek);
        int secondPop = oldStack.pop();
        System.out.println(secondPop);

        Deque<Integer> stackWithArrayDeque = new ArrayDeque<>();

        stackWithArrayDeque.push(1);
        stackWithArrayDeque.push(2);
        System.out.println("\n[stackWithArrayDeque] : ");
        System.out.println("stackWithArrayDeque pep: " + stackWithArrayDeque.pop());
        System.out.println("stackWithArrayDeque peek: " + stackWithArrayDeque.peek());
    }
}
