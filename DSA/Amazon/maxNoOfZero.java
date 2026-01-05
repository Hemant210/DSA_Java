package DSA.Amazon;

public class maxNoOfZero {
    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 2, 4, 6, 5, 1};
        System.out.println(MaxZero(nums));
    }

    public static int MaxZero(int[] nums){
        int count = 0;
        int leftMin = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if (leftMin >= nums[i]) {
                count++;
                leftMin = nums[i];
            }
        }

        return count;
    }
}
