package Data_structure_Practice.Strings;

public class countSubstrings {

    // Time complexity : O(n²) & Space complexity: O(1)
    public static boolean iscount(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true; 
    }

    public static int countsubstring(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String sub = "";
            for (int j = i; j < n; j++) {
                sub += s.charAt(j);
                if (iscount(sub)) { 
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abc";
        int result = countsubstring(s);
        System.out.println(result);
    }
}
