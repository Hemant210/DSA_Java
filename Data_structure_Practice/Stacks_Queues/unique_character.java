package Data_structure_Practice.Stacks_Queues;

public class unique_character {
    public static int firstUniqChar(String s){
        for(int i = 0; i < s.length(); i++){
            char count = s.charAt(i);
            if (s.indexOf(count) == s.lastIndexOf(count)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";

        System.out.println("First Unique Character in a String Index :- " + firstUniqChar(s));
    }
}
