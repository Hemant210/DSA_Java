// public class array_practice {

//     public int majorityElement(int[] nums) {
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             int count = 0;

//             for (int j = 0; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }

//             if (count > n / 2) {
//                 return nums[i];
//             }
//         }

//         return -1; // Return -1 if no majority element
//     }

//     public static void main(String[] args) {
//         array_practice ap = new array_practice();

//         int[] arr = {8, 8, 8, 8, 8, 3, 5, 6}; // Example with 8 as majority
//         int result = ap.majorityElement(arr);

//         if (result != -1) {
//             System.out.println("Majority element is: " + result);
//         } else {
//             System.out.println("No majority element found.");
//         }
//     }
// }

//Moore’s Voting Algorithm
public class array_practice{
        public int majorityElement(int[] nums) {
            int freq = 0;
            int ans = 0;
    
            for (int i = 0; i < nums.length; i++) {
                if (freq == 0) {      // Use == for comparison
                    ans = nums[i];
                }
    
                if (ans == nums[i]) { // Use == for comparison
                    freq++;
                } else {
                    freq--;
                }
            }
    
            return ans; // This works because LeetCode guarantees a majority exists
        }
        

    public static void main(String[] args) {
        array_practice ap = new array_practice();

        int[] nums = {3,2,3}; // Example with 8 as majority
        int result = ap.majorityElement(nums);

        if (result != -1) {
            System.out.println("Majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }

}