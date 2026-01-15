package Data_structure_Practice.Arrays;

public class findMin {
    public static int findminoperation(int[] arr){
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else if (arr[left] < arr[right]) {
                arr[left + 1] = arr[left] + arr[left + 1];
                left++;
                right++;
            } else {
                arr[right - 1] = arr[right] + arr[right - 1];
                right--;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 1};
        System.out.println(findminoperation(nums));

    }
}
