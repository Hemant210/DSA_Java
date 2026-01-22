package Data_structure_Practice.Strings;

public class Validpalindrome {
    // Time complexity :- O(n) and space :- O(1)
    public static boolean alphanumeric(char ch) {
        if ((ch >= '0' & ch <= '9') ||
                (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')) {
            return true;
        }

        return false;
    }

    public static boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length() - 1;

        while (st < end) {
            if (!alphanumeric(s.charAt(st))) {
                st++;
                continue;
            }

            if (!alphanumeric(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            st++;
            end--;

        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
