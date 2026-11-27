package Top_Interview_150.Day_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_intervals {
    public static int[][] insert(int[][] intervals, int[] newIntervals){
        List<int[]> ans = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][1] < newIntervals[0]) {
            ans.add(intervals[i]);
            i++;
        }

        while (i < intervals.length && intervals[i][0] < newIntervals[1]) {
            newIntervals[1] = Math.max(newIntervals[1], intervals[i][1]);
            newIntervals[0] = Math.max(newIntervals[0], intervals[i][0]);
            i++;
        }

        ans.add(newIntervals);

        while (i < intervals.length) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };

        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }
}
