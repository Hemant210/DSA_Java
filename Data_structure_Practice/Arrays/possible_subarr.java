package Data_structure_Practice.Arrays;

public class possible_subarr {
    public static int subarray(int[] nums, int target){
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum == target) count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;

        System.out.println("Subarray Sum Equals K :- " + subarray(arr, k));
    }
}
