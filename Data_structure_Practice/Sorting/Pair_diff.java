package Data_structure_Practice.Sorting;

public class Pair_diff {

    //[Naive Approach] Using 2 Nested Loops
    //Time Complexity :- O(n^2) & Space Complexity : O(1)     
    public static boolean findPair(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == x) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 20, 3, 2, 50, 80 };
        int x = 78;

        if (findPair(arr, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
