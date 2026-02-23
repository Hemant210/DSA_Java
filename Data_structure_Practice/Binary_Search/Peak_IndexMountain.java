package Data_structure_Practice.Binary_Search;

public class Peak_IndexMountain {
    //Time Complexity :- O(log(n)) & & Space complexity: O(1)
    public static int peakIndexInMountainArray(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low)/2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
    public static void main(String[] args) {
       int[] arr = {0,1,0};
       System.out.println(peakIndexInMountainArray(arr));
    }
}
