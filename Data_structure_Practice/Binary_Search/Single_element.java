package Data_structure_Practice.Binary_Search;

public class Single_element {
    //Naive Approch
    // Time Complexity :- O(n)& Space Complexity : O(1)
    public static int Find_Element(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }

        return ans;
    }

    //Binary Search Approch
    //Time Complexity :- O(log n) & Space Complexity : O(1)
    public static int single_element(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            
            if (mid % 2 == 1) {
                mid--; 
            }

            if (nums[mid] == nums[mid+1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        //System.out.println(Find_Element(nums));
        System.out.println(single_element(nums));
    }
}
