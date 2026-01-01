package Amazon;

import java.util.ArrayList;

// class MaxMinInArray {
//     public static ArrayList<Integer> findMinMax(int[] arr) {
//         int mini = Integer.MAX_VALUE;
//         int maxi = Integer.MIN_VALUE;

//         // Find minimum and maximum
//         for (int num : arr) {
//             if (num < mini) mini = num;
//             if (num > maxi) maxi = num;
//         }

//         ArrayList<Integer> result = new ArrayList<>();
//         result.add(mini);
//         result.add(maxi);
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 4, 1, 9};
//         ArrayList<Integer> result = findMinMax(arr);
//         System.out.println(result.get(0) + " " + result.get(1));
//     }
// }

public class MaxMinInArray {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 9 };

        if (arr.length == 0) {
            System.out.println("Array is Empty");
            return;
        }

        int min = arr[0];
        int max = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum :- " + min);
        System.out.println("Maximum :- " + max);
    }
}