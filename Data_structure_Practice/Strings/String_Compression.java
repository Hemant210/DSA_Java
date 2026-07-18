package Data_structure_Practice.Strings;

import java.util.Arrays;

public class String_Compression {
    public static int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            if (count == 1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                String str = Integer.toString(count);
                for (char dig : str.toCharArray()) {
                    chars[idx++] = dig;
                }
            }

            i--;
        }

        return idx;

    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

        int len = compress(chars);

        System.out.print("Compressed Array :- ");
        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + "");
        }
    }
}
