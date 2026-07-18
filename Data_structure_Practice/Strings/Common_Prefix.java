package Data_structure_Practice.Strings;

import java.util.Arrays;

public class Common_Prefix {
    public static String longestCommonPrefix(String[] strs){
        StringBuilder result = new StringBuilder();
        int n = strs.length;

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[n-1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if (first[i] != last[i]) {
                break;
            }

            result.append(first[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
