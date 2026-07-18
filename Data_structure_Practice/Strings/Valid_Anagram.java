package Data_structure_Practice.Strings;

import java.util.Arrays;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t){
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        int[] count = new int[26];

        for(int i = 0; i < n; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if (count[i] != 0) {
                return false;
            }
        }

        return true;

    }


    public static boolean check_anagram(String s, String t){
        char[] n = s.toCharArray();
        char[] m = t.toCharArray();
        
        Arrays.sort(n);
        Arrays.sort(m);

        return Arrays.equals(n, m);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        System.out.println(check_anagram(s, t));
    }
}
