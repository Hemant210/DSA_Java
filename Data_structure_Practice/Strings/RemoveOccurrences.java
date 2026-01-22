package Data_structure_Practice.Strings;

public class RemoveOccurrences {
    //Time Complexity: O(n² × m) & Space Complexity: O(n)
    public static String removeOccurrences(String s, String part){
        while (s.length() > 0 && s.contains(part)) {
            s = s.replaceFirst(part, "");
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        String result = removeOccurrences(s, part);
        System.out.println(result);
        
    }
}
