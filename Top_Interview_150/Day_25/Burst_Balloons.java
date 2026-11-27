package Top_Interview_150.Day_25;

import java.util.Arrays;

public class Burst_Balloons {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> (a[1] - b[1]));
        int arrow = 1;
        int curr = points[0][1];

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > curr) {
                arrow++;
                curr = points[i][1];
            }
        }

        return arrow;
    }

    public static void main(String[] args) {
        int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };

        System.out.println(findMinArrowShots(points));
    }
}
