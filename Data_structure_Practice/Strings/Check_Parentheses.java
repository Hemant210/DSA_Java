package Data_structure_Practice.Strings;

import java.util.Stack;

public class Check_Parentheses {
    //Time complexity :- O(n) & space :- O(n)
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') { //opening
                st.push(s.charAt(i));
            } else { //closing
                if (st.size() == 0) {
                    return false;
                }

                if ((st.peek() == '{' && s.charAt(i) == '}') ||
                    (st.peek() == '[' && s.charAt(i) == ']') ||
                    (st.peek() == '(' && s.charAt(i) == ')')) {
                        st.pop();
                } else { //no match
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
