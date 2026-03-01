package Data_structure_Practice.Binary_Search;

public class Book_allocation {
    public static boolean isValid(int[] arr, int n, int m, int maxallowedPages){
        int students = 1, pages = 0;

        for(int i = 0; i < n; i++){
            if (arr[i] > maxallowedPages) {
                return false;
            }

            if (pages + arr[i] <= maxallowedPages) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }
        
        return students > m ? false : true;
    }

    //Time Complexity :- O(n * log(sum)) & Space Complexity : O(1)
    public static int allocatebook(int[]arr , int n, int m) {
        if (m > n) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int ans = -1;

        int start = 0, end = sum;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValid(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };
        int n = 4, m = 2;

        System.out.println(allocatebook(arr, n, m));
    }
}
