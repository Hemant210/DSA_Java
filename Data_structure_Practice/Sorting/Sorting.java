package Data_structure_Practice.Sorting;

public class Sorting {
    // Bubble Sort
    // Time Complexity :- O(n^2) & Space Complexity : O(1)
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap array element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSwap = true;
                }
            }

            if (!isSwap) { // Array Alredy sorted
                return;
            }
        }
    }

    // Selection Sort
    // Time Complexity :- O(n^2) & Space Complexity : O(1)
    public static void selectionsort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int smallidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallidx]) {
                    smallidx = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[smallidx];
            arr[smallidx] = temp;
        }
    }

    // Insertion Sort
    // Time Complexity :- O(n) & Space Complexity : O(1)
    public static void insertion_sort(int[] arr, int n){
        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 4, 1, 5, 2, 3 };
        int n = a.length;

        bubbleSort(a, n);
        selectionsort(a, n);
        insertion_sort(a, n);

        System.out.println("Sorted Array :- ");
        printArray(a);
    }
}
