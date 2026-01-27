package Data_structure_Practice.Strings;

public class lengthOfLongestSubstring {
    // Time complexity : O(2) & Space complexity: O(1)
    public static int lengthLongestSubstring(String s) {
        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[128];
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                freq[c]++;
                if (freq[c] >= 2) {
                    break;
                }

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthLongestSubstring(s);
        System.out.println(res);
    }
}
