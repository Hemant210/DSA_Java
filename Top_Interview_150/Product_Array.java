package Top_Interview_150;

public class Product_Array {
    public static int[] productarray(int[] nums){
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;

        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        for(int i = n - 1; i <= 0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        for(int i = 0; i < nums.length; i++){
            System.out.println(productarray(nums));
        }
    }
}
