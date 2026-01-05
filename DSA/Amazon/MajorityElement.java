package Amazon;

import java.util.Arrays;

public class MajorityElement {
    static int majorelement(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int c = arr[n / 2];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (n == c) {
                count++;
            }
        }

        if (count > n / 2) {
            return c;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
        System.out.println("Majority Element in Array is :- " + majorelement(arr));
    }

}
