package Top_Interview_150;

public class Reverse_word {
    public static String reverseword(String s){
        String[] word = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i = word.length - 1; i >= 0; i--){
            sb.append(word[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";

        System.out.println(reverseword(str));
    }
}
