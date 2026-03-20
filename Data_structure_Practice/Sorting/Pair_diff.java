package Data_structure_Practice.Sorting;

import java.util.Arrays;

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

    //Using Sorting and Binary Search
    //Time Complexity :- O(n log(n)) & Space Complexity : O(1)     
    public static boolean Find_pair(int[] arr, int x){
        Arrays.sort(arr);

        int n = arr.length;

        for(int i = 0; i < n; i++){
            int target = arr[i] + x;

            if (binarySearch(arr, i + 1, n - 1, target)) {
                return true;
            }
        }

        return false;
    }


    // Binary search function
    public static boolean binarySearch(int[] arr, int left, int right, int key){
        while (left <= right) {
            int mid = left + (right - left)/2;

            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] arr = { 5, 20, 3, 2, 50, 80 };
        int x = 78;

        if (Find_pair(arr, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
