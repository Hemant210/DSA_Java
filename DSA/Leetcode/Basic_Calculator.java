//224. Basic Calculator - Recursionn

package Leetcode;

import java.util.*;

public class Basic_Calculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (Character.isDigit(curr)) {
                number = number * 10 + (curr - '0');
            } else if (curr == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (curr == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (curr == '(') {
                // Push current result and sign
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (curr == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop(); // sign before '('
                result += stack.pop(); // result before '('
            }
        }

        if (number != 0) {
            result += sign * number;
        }

        return result;
    }

    public static void main(String[] args) {
        Basic_Calculator calculator = new Basic_Calculator();

        String expression2 = "2-1 + 2";
        String expression3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println("Expression: " + expression2 + " => Result: " + calculator.calculate(expression2));
        System.out.println("Expression: " + expression3 + " => Result: " + calculator.calculate(expression3));
    }
}
