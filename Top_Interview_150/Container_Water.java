package Top_Interview_150;

public class Container_Water {
    public static int Max_Area(int[] heights){
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int w = right - left;
            int h = Math.min(heights[left], heights[right]);
            int area = w * h;
            max = Math.max(max, area);

            if (heights[left] < heights[right]) {
                left++;
            } else if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
                right--;
            }

        }

        return max;

    }

    public static void main(String[] args) {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(Max_Area(heights));
    }
}
