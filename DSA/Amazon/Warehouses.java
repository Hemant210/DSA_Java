package DSA.Amazon;

import java.util.Arrays;

public class Warehouses {
    public static int totalValidPosForWarehouses(int[] arr, int d) {

        int maxi = Arrays.stream(arr).max().getAsInt();
        int mini = Arrays.stream(arr).min().getAsInt();

        int overlap = (mini + d) - (maxi - d) + 1;

        return Math.max(0, overlap);
    }

    public static void main(String[] args) {
        int[] centre = { -2, 4, 5 };
        int d = 6;

        System.out.println("Number of warehouses :- " + totalValidPosForWarehouses(centre, d));
    }
}
