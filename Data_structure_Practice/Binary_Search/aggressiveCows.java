package Data_structure_Practice.Binary_Search;

import java.util.Arrays;

public class aggressiveCows {
    // S = stall, C = Cows
    public static boolean isValid(int[] stall, int c, int mid) {
        int n = stall.length;
        int cowsplaced = 1;
        int l = 0;

        for (int i = 1; i < n && cowsplaced < c; i++) {
            if (stall[i] - stall[l] >= mid) {
                cowsplaced++;
                l = i;
            }
        }

        return cowsplaced == c;
    }

    public static int aggressive_cows(int[] stall, int c) {
        Arrays.sort(stall);
        int n = stall.length;

        int low = 1;
        int high = stall[n - 1] - stall[0];
        int maxdistance = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(stall, c, mid)) {
                maxdistance = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return maxdistance;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 9, 3, 8};
        //int[] arr1 = {4, 2, 1, 10, 6};
        int k = 3;

        System.out.println("The minimum distance between any two cows :- ");
        System.out.println(aggressive_cows(arr, k));
    }
}
