package DSA.Amazon;

import java.util.ArrayList;
import java.util.List;

public class FindMinimummedian {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(20,10,1,13,5,8,6,8));
        int k = 5;

        nums.sort(null);
        System.out.println("Sorted Array :- " + nums);

        int low = 0, high = k - 1;
        int mid = (low + high)/2;
        int midian = nums.get(mid);

        int n = nums.size();
        low = n - k; 
        high = n - 1;
        mid = (low + high)/2;

        int maxMedian = nums.get(mid);

        System.out.println("Min Median of K-length subsequences :- " + midian);
        System.out.println("Max Median of K-length subsequences :- " + maxMedian);
    }
}
