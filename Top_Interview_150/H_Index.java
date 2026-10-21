package Top_Interview_150;

public class H_Index {
    public static int hIndex(int[] nums) {
        int idx = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= idx)
                idx++;
            else
                break;
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 6, 1, 5 };
        System.out.println(hIndex(nums));
    }
}
