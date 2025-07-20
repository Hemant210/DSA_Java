package Practice;

import java.util.Stack;

public class Stack_practice {
    
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Print and pop each element until stack is empty
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // show top element
            s.pop(); // remove top element
        }
    }
}
