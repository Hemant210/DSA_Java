package Data_structure_Practice.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static List<List<String>> groupanagram(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char arr[] = strs[i].toCharArray();
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
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupanagram(strs));
    }
}
