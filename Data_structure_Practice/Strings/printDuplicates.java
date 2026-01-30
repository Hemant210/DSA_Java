package Data_structure_Practice.Strings;

import java.util.Arrays;

//Print all the duplicate characters in a string
public class printDuplicates {
    //Time complexity :- O(n*log(n)) & Space :- O(1)
    public static void printduplicate(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            if (count > 1) {
                System.out.print("['" + arr[i] + "', " + count + "], ");
            }
        }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printduplicate(s);
    }
}
