//import java.util.ArrayList;

public class Stack {
    // // Linked List Implementation of Stack
    // // Node class represents a single element in the linked list
    // static class Node {
    // int data; // data part of the node
    // Node next; // reference to the next node

    // public Node(int data) {
    // this.data = data;
    // next = null;
    // }
    // }

    // // Stack implementation using linked list
    // static class Stack_class {
    // public static Node head; // top of the stack

    // // Stack is empty if head is null
    // public static boolean isEmpty() {
    // return head == null;
    // }

    // // Push: add element to top
    // public static void push(int data) {
    // Node newNode = new Node(data);
    // if (isEmpty()) {
    // head = newNode;
    // return;
    // }
    // newNode.next = head; // new node points to current head
    // head = newNode; // head now becomes the new node
    // }

    // // Pop: remove and return top element
    // public static int pop() {
    // if (isEmpty()) {
    // return -1; // return -1 if stack is empty
    // }
    // int top = head.data;
    // head = head.next; // move head to next node
    // return top;
    // }

    // // Peek: return top element without removing
    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }
    // }

    // ArrayList Implementation of Stack
    // static class Stack_class {
    //     // Using ArrayList to store elements
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     // Push: add element to end of list (top of stack)
    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     // Pop: remove and return top element
    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1; // if stack is empty
    //         }
    //         // get and remove last element
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }

    //     // Peek: return top element without removing
    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);
    //     }
    // }

    // public static void main(String[] args) {
    //     Stack_class s = new Stack_class(); // create stack object

    //     // Pushing elements onto the stack
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);

    //     // Print and pop each element until stack is empty
    //     while (!s.isEmpty()) {
    //         System.out.println(s.peek()); // show top element
    //         s.pop(); // remove top element
    //     }
    // }
}
