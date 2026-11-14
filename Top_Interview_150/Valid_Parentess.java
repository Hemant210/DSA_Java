package Top_Interview_150;

import java.util.*;;
public class Valid_Parentess {
    public static boolean validparent(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

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
        String s = "(]";
        
        System.out.println(validparent(s));
    }
}
