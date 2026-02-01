package Data_structure_Practice.Strings;

public class minWindowsub {
    public static boolean MinimumWindowString(String s, String t) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < t.length(); i++) {
            char arr = t.charAt(i);
            int index = sb.indexOf(String.valueOf(arr));

            if (index == -1) {
                return false;
            }

            sb.deleteCharAt(index);
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(MinimumWindowString(s, t));

    }
}
