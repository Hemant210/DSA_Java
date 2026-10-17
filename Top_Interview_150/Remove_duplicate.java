package Top_Interview_150;

public class Remove_duplicate {
    public static int removeDuplicates(int[] nums){
        int k = 1;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] != nums[k - 1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
  
    public static void main(String[] args) {
        int[] nums = {1,1,2};

        System.out.println(removeDuplicates(nums));
    }
}
