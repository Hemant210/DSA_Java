//Time complexity = O(n*n)
public class Backtracking {
    public static void printpermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr_char = str.charAt(i);
            String new_Str = str.substring(0, i) + str.substring(i + 1);
            printpermutation(new_Str, perm + curr_char, idx + 1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(str, "", 0);
    }
}
