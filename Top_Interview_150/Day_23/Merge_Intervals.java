package Top_Interview_150.Day_23;

import java.util.Arrays;

public class Merge_Intervals {
    public static int[][] mergeintervals(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));

        int index = 0;

        for(int i = 0; i < intervals.length; i++){
            if (intervals[i][0] <= intervals[index][1]) {
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 } };

        System.out.println(Arrays.deepToString(mergeintervals(intervals)));

    }
}
