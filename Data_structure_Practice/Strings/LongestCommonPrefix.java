package Data_structure_Practice.Strings;

public class LongestCommonPrefix {
    public static String Longestcommonprefix(String[] strs){
        if (strs.length == 0 || strs == null) {
            return "";
        }

        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        System.out.println(Longestcommonprefix(str));
    }
}
