package Leetcode;
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
import java.util.*;
// public class Bubble_practice {
//     public static void main(String[] args) {
//         int[] num = {2, 0, 2, 1, 1, 0};  
//         int low = 0, mid = 0, high = num.length - 1;

//         while (mid <= high) {
//             if (num[mid] == 0) {
//                 int temp = num[low];
//                 num[low] = num[mid];
//                 num[mid] = temp;
//                 low++;
//                 mid++;
//             } else if (num[mid] == 1) {
//                 mid++;
//             } else {
//                 int temp = num[mid];
//                 num[mid] = num[high];
//                 num[high] = temp;
//                 high--;
//             }
//         }

//         // Print the sorted array
//         for (int n : num) {
//             System.out.print(n + " ");
//         }
//     }
// }

//Since the result may be very large, so you need to return a string instead of an integer.
public class Bubble_practice {
    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // If highest number is 0, all are 0
        if (strNums[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strNums) {
            sb.append(s);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        int[] nums2 = {3, 30, 34, 5, 9};

        System.out.println("Output 2: " + largestNumber(nums2)); // Output: 9534330
    }
}

