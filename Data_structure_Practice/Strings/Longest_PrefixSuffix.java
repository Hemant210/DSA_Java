package Data_structure_Practice.Strings;

public class Longest_PrefixSuffix {
    // Time complexity : O(n^2) & Space complexity : O(1)
    public static int longestPrefixSuffix(String s) {
        int n = s.length();

        for (int i = n - 1; i > 0; i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(n - i, n);

            if (prefix.equals(suffix)) {
                return i;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(longestPrefixSuffix(s));
    }
}
