package Leetcode;

import java.util.Stack;

//Add 155. Min Stack Leetcode
public class Min_Stack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    // Constructor
    public Min_Stack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Min_Stack minStack = new Min_Stack(); // constructor call

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Top: " + minStack.top()); // 2
        System.out.println("Min: " + minStack.getMin()); // 2

        minStack.pop();
        System.out.println("Top after pop: " + minStack.top()); // 7
        System.out.println("Min after pop: " + minStack.getMin()); // 3
    }
}
