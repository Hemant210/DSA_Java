package Amazon;

import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {
    static int kthlarge(Integer[] arr, int k){
        Arrays.sort(arr, Collections.reverseOrder());

        return arr[k - 1];
    }

    public static void main(String[] args) {
        Integer[] arr = {12, 3, 5, 7, 19};
        int K = 2;

        System.out.println("Second Largest Element is :- " + kthlarge(arr, K));
    }
}
