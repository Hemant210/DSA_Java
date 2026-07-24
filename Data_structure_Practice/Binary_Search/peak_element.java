package Data_structure_Practice.Binary_Search;

public class peak_element {
    //Binary Search Approch
    //Time Complexity :- O(log(n)) & & Space complexity: O(1)
    public static int peakIndexInMountainArray(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low)/2;

            if (arr[mid] < arr[mid + 1])  {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,1};
       System.out.println(peakIndexInMountainArray(arr));
       //System.out.println(peakArray(arr));
    }
}
