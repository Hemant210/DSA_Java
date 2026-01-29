package Data_structure_Practice.Strings;

import java.util.Arrays;

//Print all the duplicate characters in a string
public class printDuplicates {
    // Time complexity :- O(n*log(n)) and Space :- O(1)
    public static void printduplicate(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        for (int i = 0; i < s.length(); i++) {
            int count = 1;

            while (i + count < arr.length && arr[i] == arr[i + count]) {
                count++;
            }

            if (count > 1) {
                System.out.print("['" + arr[i] + "', " + count + "], ");
            }

            i += count;
        }

    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        printduplicate(s);
    }
}
