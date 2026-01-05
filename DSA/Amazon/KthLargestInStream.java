package Amazon;

import java.util.ArrayList;
import java.util.Collections;

public class KthLargestInStream {

    public static int[] kthlargest(int[] arr, int k) {
        int[] res = new int[arr.length];

        ArrayList<Integer> topk = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            topk.add(arr[i]);

            Collections.sort(topk);

            if (topk.size() >= k) {
                res[i] = topk.get(i - k + 1);
            } else {
                res[i] = -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 4;

        int res[] = kthlargest(arr, k);

        for (int x : res) {
            System.out.println(x + " ");
        }
    }
}
