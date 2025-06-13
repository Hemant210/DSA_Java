// //Ascending order
import java.util.*;
// public class Sorting {

//     public static void printArray(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println(); 
//     }

//     public static void main(String []args) {
//         int arr[] = {7, 8, 3, 2, 1};

//         //time complexity = O(n^2)
//         // Bubble Sort
//         for(int i=0; i<arr.length-1; i++) {//n-1
//             for(int j=0; j<arr.length-i-1; j++) { //n-
//                 if(arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }

//         printArray(arr);
//     }
// }    

//descending order 
public class Bubble_sort {

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String []args) {
        int arr[] = {7, 8, 3, 2, 1};

        // Bubble Sort in Descending Order
        // Time complexity = O(n^2)
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j + 1]) { // change > to < for descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArray(arr); // Output: 8 7 3 2 1
    }
}
