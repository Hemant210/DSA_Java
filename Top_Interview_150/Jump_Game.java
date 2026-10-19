package Top_Interview_150;

public class Jump_Game {
    public static boolean canJump(int[] nums) {
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > idx)
                return false;

            idx = Math.max(idx, nums[i] + i);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };

        System.out.println(canJump(nums));
    }
}
