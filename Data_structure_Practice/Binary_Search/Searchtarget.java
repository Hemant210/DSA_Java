package Data_structure_Practice.Binary_Search;

public class Searchtarget {
    //Binary Search Approch
    //Time Complexity :- O(log n) & Space Complexity : O(1)
    public static int Find_Element(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
       int[] arr = { -1, 0, 3, 5, 9, 12 };
       System.out.println(Find_Element(arr, 9));
    }
}
