package Practice;

import java.util.*;

public class Queue_practice {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Queue elements:");
        // Print and remove all elements one by one
        while (!q.isEmpty()) {
            System.out.println("Peek: " + q.peek());
            q.remove();

        }
    }
}
