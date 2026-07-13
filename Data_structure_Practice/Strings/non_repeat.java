package Data_structure_Practice.Strings;

public class non_repeat {
    public static char n_repeat(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return s.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String s = "aabbcc";

        char ans = n_repeat(s);

        if (ans == '\0') {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    
    }
}
