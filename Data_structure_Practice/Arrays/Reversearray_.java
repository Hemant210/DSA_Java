package Data_structure_Practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// public class Reversearray_ {
//     static void reverse(int[] arr) {
//         int n = arr.length;

//         for (int i = 0; i < n / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[n - i - 1];
//             arr[n - i - 1] = temp;
//         }
//     }

// Time Complexity: O(n) & O(1) Space
//     public static void main(String[] args) {
//         int[] arr = { 1, 4, 3, 2, 6, 5 };

//         reverse(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

public class Reversearray_ {
    //Using Inbuilt Methods - O(n) Time and O(1) Space
    public static void reversearr(List<Integer> arr){
        Collections.reverse(arr);
    }
     public static void main(String[] args) {
        List<Integer> res = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5 ));

        reversearr(res);
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
     }
}