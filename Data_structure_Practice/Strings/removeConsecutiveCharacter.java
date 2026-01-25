package Data_structure_Practice.Strings;

public class removeConsecutiveCharacter {
    public static String removeDuplicateCharacater(String s) {
        // If string is empty or has only one character
        if (s.length() == 0)
            return "";

        StringBuilder result = new StringBuilder();

        // Add first character
        result.append(s.charAt(0));

        // Start from second character
        for (int i = 1; i < s.length(); i++) {
            // Add only if current char is not same as previous
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String str = "aabbccdde";

        String r = removeDuplicateCharacater(str);
        System.out.println(r);
    }
}
