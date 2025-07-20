package Practice;

import java.util.Stack;

public class Stack_practice {

    // Collection Frameworks
    // public static void main(String[] args) {
    // Stack<Integer> s = new Stack<>();
    // s.push(1); // push element to stack
    // s.push(2);
    // s.push(3);
    // s.push(4);

    // while (!s.isEmpty()) {
    // System.out.println(s.peek()); // show top element
    // s.pop(); // remove top element
    // }
    // }

    // Function to insert an element at the bottom of the stack using recursion
    public static void print_number(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            // base case: if stack is empty, insert the new data at bottom
            s.push(data);
            return;
        }

        // remove top element and hold it in top variable
        int top = s.pop();

        // recursive call to reach bottom of stack
        print_number(data, s);

        // after inserting data at bottom, push the held elements back
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // pushing initial values into stack
        s.push(1);
        s.push(2);
        s.push(3);

        // inserting 4 at bottom of stack using recursion
        print_number(4, s);

        // printing and emptying the stack
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // print top element
            s.pop(); // remove top element
        }
    }
}
