package Top_Interview_150;

import java.util.HashMap;
import java.util.Map;

public class Roman_Integer {
    public static int romantInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length(); i++){
            int current = mp.get(s.charAt(i));
            if (i + 1 < s.length() && current < mp.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romantInt(s));
    }
}
