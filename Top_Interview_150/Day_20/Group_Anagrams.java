package Top_Interview_150.Day_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static List<List<String>> groupanagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];

            HashMap<Character, Integer> fmap = new HashMap<>();
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
            }

            if (!map.containsKey(fmap)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(fmap, list);
            } else {
                map.get(fmap).add(s);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupanagrams(str));
    }
}
