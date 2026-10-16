package Top_Interview_150;

public class Remove_element {
    public static int remove(int[] nums, int val){
        int n = nums.length;
        int k = 0;

        for(int i = 0; i < n; i++){
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    } 
    
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        System.out.println(remove(nums, val));
    }
}
