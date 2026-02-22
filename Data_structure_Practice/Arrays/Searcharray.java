package Data_structure_Practice.Arrays;

public class Searcharray {

    //Linear Search Approch
    // Time Complexity: O(n) & Space Complexity : O(1)
    public static int Find_rotedarray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }


    //Binary Search Approch
    //Time Complexity :- O(log n) & Space Complexity : O(1)
    public static int Find_Element(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        
        while (start <= end) {
            //int mid = (start + end)/2; //Beginer
            int mid = start + (end - start)/2; //Advance solve overflow problem

            if (target > arr[mid]) {
                start = mid + 1; // First Phase of Array
                
            }
            else if(target < arr[mid]){
                end = mid - 1; // Second phase of Array
            } else {
                return mid;
            }
        }

        return -1;
    }

    //Recursion Approch
    //Time Complexity  : O(log n) & Space Complexity : O(1)
    public static int Recursion_binarysearch(int[] arr, int tar, int st, int en){
        if (st <= en) {
            int mid = st + (en - st)/2;

            if (tar > arr[mid]) {
                return Recursion_binarysearch(arr, tar, mid + 1, en);
            }

            else if (tar < arr[mid]) {
                return Recursion_binarysearch(arr, tar, st, mid - 1);
            }

            return mid;
        }

        return -1;

    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = 0;
        //System.out.println(Find_rotedarray(arr, 9));
        //System.out.println(Find_Element(arr, 12));
        System.out.println(Recursion_binarysearch(arr, target, 0, arr.length - 1));
    }
}
 