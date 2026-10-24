package Top_Interview_150;

public class Trapping_Rain_Water {

    public static int trap(int[] heights) {
        int left = 0, right = heights.length - 1;
        int leftmax = 0, rightmax = 0;

        int watertrap = 0;

        while (left < right) {
            if (heights[left] < heights[right]) {
                if (heights[left] >= leftmax) {
                    leftmax = heights[left];
                } else {
                    watertrap += leftmax - heights[left];
                }
                left++;
            } else {
                if (heights[right] >= rightmax) {
                    rightmax = heights[right];
                } else {
                    watertrap += rightmax - heights[right];
                }
                right--;
            }
        }

        return watertrap;
    }

    public static void main(String[] args) {
        int[] heights = { 4, 2, 0, 3, 2, 5 };

        System.out.println(trap(heights));
    }
}
