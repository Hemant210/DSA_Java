package Top_Interview_150;
 
public class Is_Subsequence {
    public static boolean Check_Subsequence(String s, String t){
        int st = 0, th = 0;

        while (st < s.length() && th < t.length()) {
            if (s.charAt(st) == t.charAt(th)) {
                st++;
            }

            th++;
        }

        return st == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(Check_Subsequence(s, t));
    }
}
