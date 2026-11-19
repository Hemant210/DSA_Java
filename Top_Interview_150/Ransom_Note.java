package Top_Interview_150;

import java.util.HashMap;

public class Ransom_Note {
    public static boolean find_ransom(String ransomNoe, String magazine){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c , 0) + 1);
        }

        for(char c : ransomNoe.toCharArray()){
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";

        System.out.println(find_ransom(ransomNote, magazine));
    }
}
