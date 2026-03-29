package Data_structure_Practice.Sorting;

import java.util.Arrays;

public class Permutation_sum {
        //Time Complexity :- O(n log(n)) & Space Complexity : O(1)     
        public static boolean isPossible(int[] a, int[] b, int target) {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[i] == target) {
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        int[] a = { 2, 1, 3 };
        int[] b = { 7, 8, 9 };
        int target = 10;

        if (isPossible(a, b, target)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
