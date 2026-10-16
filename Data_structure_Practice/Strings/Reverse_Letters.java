package Data_structure_Practice.Strings;

public class Reverse_Letters {
    // Time Complexity: O(n² × m) & Space Complexity: O(n)
    public static String Letter_Reverse(String s){
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetter(str[left])) {
                left++;
            } else if (!Character.isLetter(str[right])) {
                right--;
            } else {
                char temp = str[right];
                str[right] = str[left];
                str[left] = temp;
                left++;
                right--;
            }
        }

        return new String(str);
    }
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(Letter_Reverse(s));
    }
}
