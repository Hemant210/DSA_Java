package Data_structure_Practice.Strings;

public class Validpalindrome {
    // Time complexity :- O(n) and space :- O(1)
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

class Solution {
    public int romanToInt(String s) {
        int I = 1;
int V    =         5;
int X  =           10;
int L      =      50;
int C      =      100;
int D      =      500;
int M      =      1000;
    }
}