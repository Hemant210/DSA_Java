package Data_structure_Practice.Arrays;

public class Findminimum {
    public static int findmin(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if (nums[0] > nums[i]) {
                nums[0] = nums[i];
            }
        }

        return nums[0];
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findmin(arr));
    }
}