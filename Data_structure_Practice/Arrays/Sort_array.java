package Data_structure_Practice.Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Sort_array {
    public static int[] sortarr(int[] nums){
        int[] count = new int[2 * 5000 + 1];

        for(int i = 0; i < nums.length; i++){
            count[nums[i] + 5000]++;
        }

        int writend = 0;
        for(int n = 0; n < count.length; n++){
            int freq = count[n];
            while (freq != 0) {
                nums[writend] = n - 5000;
                writend++;
                freq--;
            }
        }

        return nums;
    }

    public static int[] arr_sort(int[] nums){
        int count = 0;
        int[] ans = new int[nums.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.offer(nums[i]);
        }

        while (!pq.isEmpty()) {
            ans[count++] = pq.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        System.out.println(Arrays.toString(arr_sort(arr)));
    }
}
