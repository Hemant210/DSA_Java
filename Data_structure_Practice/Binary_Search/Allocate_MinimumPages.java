package Data_structure_Practice.Binary_Search;

public class Allocate_MinimumPages {
    public static boolean isPossible(int arr[], int k, int limit) {
        int students = 1, pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] > limit) {
                students++;
                pages = arr[i];
            } else {
                pages += arr[i];
            }
        }

        return students <= k;
    }

    //Time Complexity :- O(N*(totalSum-maxValue+1)) & Space Complexity : O(1)
    public static int Find_pages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            return -1;
        }

        int low = arr[0];
        int high = 0;

        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        for (int limit = low; limit <= high; limit++) {
            if (isPossible(arr, k, limit)) {
                return limit;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k = 2;

        System.out.println(Find_pages(arr, k));
    }
}
