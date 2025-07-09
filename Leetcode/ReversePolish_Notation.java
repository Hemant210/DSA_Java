//150. Evaluate Reverse Polish Notation
package Leetcode;

import java.util.Stack;

public class ReversePolish_Notation {
    public int reverse_notation(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String tokem : tokens) {
            if (isOperator(tokem)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a, b, tokem));
            } else {
                stack.push(Integer.parseInt(tokem));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return "+-*/".contains(token);
    }

    public int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        ReversePolish_Notation rpn = new ReversePolish_Notation();
        String[] tokens = { "2", "1", "+", "3", "*" }; // Example: (2 + 1) * 3 = 9
        int result = rpn.reverse_notation(tokens);
        System.out.println("Result: " + result);
    }
}
