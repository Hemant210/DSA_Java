package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class Minimumdiff {

    // Time Complexity: n*log(n), where n is the size of arr[].
    // Auxiliary Space: O(1)
    public static int findminidiff(int[] arr, int m) {
        int n = arr.length;

        Arrays.sort(arr);
        
        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];

            if (diff < mindiff) {
                mindiff = diff;
            }
        }
        return mindiff;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;

        System.out.println(findminidiff(arr, m));
    }
}


// public class Minimumdiff {

//      public static void main(String[] args) {
//         int[] arr = {7, 3, 2, 4, 9, 12, 56};

//         int mini = Integer.MAX_VALUE;

//         for(int i = 0; i < arr.length;i++){
//             if (arr[i] > mini) {
//                 mini = arr[i];
//             }
//         }

//         System.out.println(mini);
//      }
// }