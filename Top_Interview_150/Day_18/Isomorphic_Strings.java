package Top_Interview_150.Day_17;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static boolean Is_isomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            char ctr = t.charAt(i);

            if (map.containsKey(str)) {
                if (map.get(str) != ctr)
                    return false;
            } else {
                if (map.containsValue(ctr))
                    return false;
            }

            map.put(str, ctr);
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "f11", t = "b23";

        System.out.println(Is_isomorphic(s, t));
    }
}
