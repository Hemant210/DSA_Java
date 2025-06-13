public class Bubble_practice {
    public static void main(String[] args) {
        int[] num = {2, 0, 2, 1, 1, 0};  // sample input

        int low = 0, mid = 0, high = num.length - 1;

        while (mid <= high) {
            if (num[mid] == 0) {
                int temp = num[low];
                num[low] = num[mid];
                num[mid] = temp;
                low++;
                mid++;
            } else if (num[mid] == 1) {
                mid++;
            } else {
                int temp = num[mid];
                num[mid] = num[high];
                num[high] = temp;
                high--;
            }
        }

        // Print the sorted array
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
