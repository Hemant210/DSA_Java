package Data_structure_Practice.Sorting;

public class counting_sort {
    // Time Complexity :- O(n + k) & Space Complexity : O(n + k)
    public static int[] countsort(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;

        // Find Maximum Value
        int maxVal = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        // Create Count array
        int[] cntArr = new int[maxVal + 1];

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            cntArr[arr[i]]++;
        }

        // Compute prefix sum
        for (int i = 1; i <= maxVal; i++) {
            cntArr[i] += cntArr[i - 1];
        }

        // Build answer array
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int v = arr[i];
            ans[cntArr[v] - 1] = v;
            cntArr[v]--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 0, 2, 3, 0, 3 };

        int[] ans = countsort(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
