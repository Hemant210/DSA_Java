package Data_structure_Practice.Strings;

public class ReverseWords {
    // Time complexity : O(n^2) & Space complexity : O(1)
    public static String reversewords(String s) {
        int n = s.length();

        s = revers(s);

        String ans = "";

        int i = 0;

        while (i < n) {
            String word = "";

            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            while (i < n && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }

            if (word.length() > 0) {
                word = revers(word);
                ans = ans.length() == 0 ? word : ans + " " + word;
            }
        }

        return ans;
    }

    public static String revers(String s) {
        char[] arr = s.toCharArray();

        int i = 0, j = s.length() - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(reversewords(s));
    }
}
