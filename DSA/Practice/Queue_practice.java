package DSA.Practice;

//import java.util.*;

//Java Collection Framework
// public class Queue_practice {

//     public static void main(String[] args) {
//         Queue<Integer> q = new ArrayDeque<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         System.out.println("Queue elements:");
//         // Print and remove all elements one by one
//         while (!q.isEmpty()) {
//             System.out.println("Peek: " + q.peek());
//             q.remove();

//         }
//     }
// }

//Queue using 2 stacks
// public class Queue_practice {
//     static class queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         public static void add(int data) {
//             while(!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while(!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empyt");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empyt");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }

//     public static void main(String[] args) {
//         queue q = new queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         System.out.println("Queue elements:");
//         // Print and remove all elements one by one
//         while (!q.isEmpty()) {
//             System.out.println("Peek: " + q.peek());
//             q.remove();
//         }
//     }
// }