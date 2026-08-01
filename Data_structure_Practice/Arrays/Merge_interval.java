package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class Merge_interval {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        int index = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][0]) {
                intervals[index][1] = Math.max(intervals[i][1], intervals[index][1]);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }

        return Arrays.copyOfRange(intervals, 0, index + 1);
    }

    public static int[][] merge_arr(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int index = 0;

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= intervals[index][1]) {
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                intervals[++index] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        int[][] ans = merge_arr(intervals);

        for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
