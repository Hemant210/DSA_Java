package Data_structure_Practice.Binary_Search;

public class Allocate_MinimumPages {
    
    //Approach - Linear Scan 
    //Time Complexity :- O(N*totalSum-maxValue+1)) & Space Complexity : O(1)    
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


    //Approach - Binary Search
    //Time Complexity :- O(N*log(totalSum-maxValue)) & Space Complexity : O(1)    
    public static boolean isAlloctionPossible(int[] pages, int k, int maxpagesallowed){
        int currentpages = pages[0];
        int requiredStudents = 1;

        for(int i =1; i < pages.length; i++){
            currentpages += pages[i];

            if (currentpages > maxpagesallowed) {
                requiredStudents++;
                currentpages = pages[i];
            }
        }

        return requiredStudents <= k;
    }
    

    public static int FindPages(int[] pages, int k){
        int n = pages.length;
        if(k > n) return -1;

        int maxSingleBook = pages[0];
        int totalPages = pages[0];

        for(int i = 1; i < n; i++){
                    maxSingleBook = Math.max(maxSingleBook, pages[i]);
           totalPages += pages[i];
        }

        int low = maxSingleBook;
        int high = totalPages;
        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (isAlloctionPossible(pages, k, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;

    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k = 2;

        System.out.println("Approach Linear Scan :- " + Find_pages(arr, k));
        System.out.println("Approach Binary Scan :- " + FindPages(arr, k));
    }
}
