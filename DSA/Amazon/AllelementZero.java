package DSA.Amazon;

public class AllelementZero {
    public static int minOperationsToMakeAllElemsZero(int[] nums) {
        int n = nums.length;
        int operation = 0;
        int proga = 0;

        // FIX: Changed i++ to i--
        for (int i = n - 1; i >= 0; i--) { 
            int new_element = nums[i] + proga;
            operation += Math.abs(new_element);

            if (new_element > 0) {
                proga += -new_element;
            } else {
                proga += Math.abs(new_element);
            }
        }

        return operation;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, -2};
        int res = minOperationsToMakeAllElemsZero(nums);
        System.out.println(res); // Correct output for this array should be 12
    }
}