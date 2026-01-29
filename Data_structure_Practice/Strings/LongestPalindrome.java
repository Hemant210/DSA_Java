package Data_structure_Practice.Strings;

public class LongestPalindrome {
    //Time complexity : O(n^3) & Space complexity : O(1)
    public static String longpalindrom(String s) {
        if (s.length() == 1) {
            return s;
        }

        int max = 1;
        String maxstr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + max; j <= s.length(); j++) {
                if (j - i > max && isPalindrome(s.substring(i, j))) {
                    max = j - i;
                    maxstr = s.substring(i, j);
                }
            }
        }
        return maxstr;
    }

    private static boolean isPalindrome(String substring) {
        int left = 0;
        int right = substring.length() - 1;

        while (left < right) {
            if (substring.charAt(left) != substring.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longpalindrom(s));
    }
}
