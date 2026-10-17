package Top_Interview_150;

public class Remove_duplicate_I {
    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        if(n <= 2) return n;
        int k = 2;

        for(int i = 2; i< nums.length; i++){
            if(nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        System.out.println(removeDuplicates(nums));
    }
}
