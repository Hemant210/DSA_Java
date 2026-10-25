package Top_Interview_150;

public class Length_Word {
    public static int lengthOfLastWord(String s){
        String trimedString = s.trim();
        int ans = 0;

        for(int i = trimedString.length() - 1; i >= 0; i--){
            if (s.charAt(i) == ' ') {
                break;
            }

            ans++;
        }

        return ans;
    }
    
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); 
    }
}
