package Top_Interview_150.Day_17;

import java.util.HashMap;

public class Word_Pattern {
    public static boolean wordpattern(String pattern, String s){
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> char_world = new HashMap<>();
        HashMap<String, Character> word_char = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if (!char_world.containsKey(c)) {
                char_world.put(c, word);
            }

            if (!word_char.containsKey(word)) {
                word_char.put(word, c);
            }

            if (!char_world.get(c).equals(word) || !word_char.get(word).equals(c)) {
                return false;
            }
        }

        return true;
    }


    public static boolean find_pattern(String pattern, String s){
        String[] words = s.split(" ");

        if(words.length != pattern.length()) return false;

        HashMap<Character, String> char_word = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if (!char_word.containsKey(c)) {
                if (char_word.containsValue(word)) return false;
                char_word.put(c, word);
            }

            else if (!char_word.get(c).equals(word)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordpattern(pattern, s));
        System.out.println(find_pattern(pattern, s));
    }
}
