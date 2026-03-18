package Data_structure_Practice.Sorting;

public class Ceiling_element {
    // Linear Search Approch
    // Time Complexity: O(n) & Space Complexity: O(1)
    public static int ceilsearch(int[] arr, int x) {
        if (x <= arr[0]) {
            return 0;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x) {
                return i;
            }

            if (arr[i] < x && arr[i + 1] >= x) {
                return i + 1;
            }
        }

        return -1;
    }

    // Binary Search Approch
    // Time Complexity: O(Log n) & Space Complexity: O(1)
    public static int ceil_search(int[] arr, int x){
        int start = 0, end = arr.length - 1, res = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 8, 10, 10, 12, 19 };
        int x = 0;

        System.out.println(ceil_search(arr, x));
        //System.out.println(ceilsearch(arr, x));
    }
}
