package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Find k largest elements in an array
public class Sorting_practice {
    public static ArrayList<Integer> Klargest(int arr[], int k) {
        int n = arr.length;

        Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(arrInteger, Collections.reverseOrder());

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            res.add(arrInteger[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;

        ArrayList<Integer> res = Klargest(arr, k);

        for (int ele : res) {
            System.out.println(ele + " ");
        }
    }
}
