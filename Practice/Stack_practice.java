package Practice;

import java.util.Stack;

// public class Stack_practice {

//     // public static void main(String[] args) {
//     // Stack<Integer> s = new Stack<>();
//     // s.push(1); // push element to stack
//     // s.push(2);
//     // s.push(3);
//     // s.push(4);

//     // while (!s.isEmpty()) {
//     // System.out.println(s.peek()); // show top element
//     // s.pop(); // remove top element
//     // }
//     // }

//     // Function to insert an element at the bottom of the stack using recursion
//     public static void print_number(int data, Stack<Integer> s) {
//         if (s.isEmpty()) {
//             // base case: if stack is empty, insert the new data at bottom
//             s.push(data);
//             return;
//         }

//         // remove top element and hold it in top variable
//         int top = s.pop();
//         print_number(data, s);

//         // after inserting data at bottom, push the held elements back
//         s.push(top);
//     }

//     // Function to reverse an all element of the stack using recursion
//     public static void reverse(Stack<Integer> s) {
//         if (s.isEmpty()) {
//             return;
//         }
//         int top = s.pop();
//         reverse(s);
//         print_number(top, s);
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         // inserting 4 at bottom of stack using recursion
//         // print_number(4, s);

//         // Reverse all element unsing recursion
//         reverse(s);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

public class Stack_practice {

    // Wrapper class to hold the deleted element
    static class Result {
        int deletedElement;
    }

    // Recursive method to delete middle element
    public static void deletemid(Stack<Integer> st, int curr, int mid, Result rs) {
        if (curr == mid) {
            rs.deletedElement = st.pop(); // Save the middle element
            return;
        }

        int temp = st.pop();
        deletemid(st, curr + 1, mid, rs);
        st.push(temp);
    }

    public static void deletemid(Stack<Integer> st, int size) {
        int mid = size / 2;
        Result rs = new Result(); 
        deletemid(st, 0, mid, rs);
        System.out.println("Deleted element: " + rs.deletedElement);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);  // Stack from top to bottom: 50, 40, 30, 20, 10

        int size = st.size();

        deletemid(st, size);

        System.out.println("Stack after deleting middle element:");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
