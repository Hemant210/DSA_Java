package Data_structure_Practice.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Permutation_String {
    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m)  
            return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < n; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2)) {
            return true;
        }

        int j = 0;
        for (int i = n; i < m; i++) {
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(j) - 'a']--;

            if (Arrays.equals(count1, count2))
                return true;

            j++;
        }

        return false;

    }

    public static boolean check_Inclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m)
            return false;

        char[] arr = s1.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < m - n; i++) {
            char[] temp = s2.substring(i, i + n).toCharArray();

            Arrays.sort(temp);

            if (Arrays.equals(arr, temp))
                return true;
        }

        return false;

    }

    public static void main(String[] args) {
        //String s1 = "ab", s2 = "eidbaooo";
        String s1 = "ab", s2 = "eidboaoo";

        System.out.println(checkInclusion(s1, s2));
        System.out.println(check_Inclusion(s1, s2));
    }
}
