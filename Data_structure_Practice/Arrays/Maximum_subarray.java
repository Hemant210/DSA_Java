package Data_structure_Practice.Arrays;

public class Maximum_subarray {
    public static int maxiarr(int [] nums){
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int currsum = 0;
            
            for(int j = i; j < n; j++){
                currsum += nums[j];
                maxsum = Math.max(maxsum, currsum);
            }
        }

        return maxsum;

    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxiarr(arr));
    }
}
