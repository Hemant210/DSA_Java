package Data_structure_Practice.Stacks_Queues;

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean check_parentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stack.size(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if (top == '{' && ch == '}' ||
                        top == '[' && ch == ']' ||
                        top == '(' && ch == ')') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


    public static boolean perntheses_valid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([]{}";
        System.out.println(perntheses_valid(s));
    }
}
