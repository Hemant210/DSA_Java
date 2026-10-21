package Top_Interview_150;

public class Jump_Game_II {
    public static int canJump(int[] nums) {
        int jump = 0, currstart = 0, currend = 0;

        for(int i = 0; i < nums.length - 1; i++){
            currstart =Math.max(currstart, i + nums[i]);

            if (i == currend) {
                currend = currstart;
                jump++;
            }
        }

        return jump;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };

        System.out.println(canJump(nums));
    }
}
