package Data_structure_Practice.Binary_Search;

public class Peak_IndexMountain {

    //Naive Approch
    //Time Complexity :- O(n) & & Space complexity: O(1)
    public static int peakArray(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int index = 0;

        for(int i = 0; i < n; i++){
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    //Binary Search Approch
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
       //System.out.println(peakArray(arr));
    }
}
