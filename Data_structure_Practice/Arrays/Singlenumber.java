package Data_structure_Practice.Arrays;

public class Singlenumber {
    public static int Findsinglenumber(int[] nums){
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(Findsinglenumber(arr));
    }
}
