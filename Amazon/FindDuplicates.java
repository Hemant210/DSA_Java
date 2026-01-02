package Amazon;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void duplicatefind(int arr[]) {
        Set<Integer> seenElements = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int element : arr) {
            if (!seenElements.add(element)) {
                duplicate.add(element);
            }
        }

        System.out.println("Duplicates :- " + duplicate);
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 4, 2, 2, 3, 5, 1};
        duplicatefind(data);
    }
}
