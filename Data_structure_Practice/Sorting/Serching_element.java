package Data_structure_Practice.Sorting;

public class Serching_element {
    // Time Complexity: O(n) & Space Complexity: O(1)
    public static int search(int arr[], int n, int x, int k) {
        int i = 0;

        while (i < n) {

            if (arr[i] == x)
                return i;

            // Jump the difference between current array
            // element and x divided by k We use max here to
            // make sure that i moves at-least one step ahead.
            i = i + Math.max(1, Math.abs(arr[i]
                    - x) / k);
        }

        System.out.println("number is " +
                "not present!");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        int n = arr.length;

        System.out.println("Element " + x +
                " is present at index "
                + search(arr, n, x, k));

    }
}
