package Data_structure_Practice.Arrays;

public class Searcharray {

    // Time Complexity: O(n) & O(1) Space
    public static int Find_rotedarray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(Find_rotedarray(arr, 9));
    }
}
 