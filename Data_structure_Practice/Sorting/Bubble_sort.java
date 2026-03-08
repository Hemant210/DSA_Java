package Data_structure_Practice.Sorting;

public class Bubble_sort {
    //Time Complexity :- O(n^2) & Space Complexity : O(1)     
    public static void bubbleSort(int[] arr, int n){
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    //Swap array element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }                
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {4,1,5,2,3};
        int n = a.length;

        bubbleSort(a, n);
        
        System.out.println("Sorted Array :- ");
        for(int i = 0; i < n; i++){
            System.out.println(a[i] + " ");
        }
    }
}
