package Data_structure_Practice.Strings;

public class CountPalindrome {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.substring(right) != s.substring(left)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    //Time complexity :- O(n3) & space :- O(1)
    public static int countPS(String s){
        int count = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                if (isPalindrome(s.substring(i,j))) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String a = "abcd";
        System.out.println(countPS(a));
    }
}
