package Leetcode;

//496. Next Greater Element I

public class Next_Greater_El {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        boolean found = false;

        for(int i=0; i < nums1.length; i++){
           found = false;
           for(int j=0; j < nums2.length; j++){
               if(nums1[i] == nums2[j]){
                   found = true;
               }

               if(found && nums2[j] > nums1[i]){
                   res[i] = nums2[j];
                   break;
               }
           }
        }

        for(int i=0; i < res.length; i++){
           if(res[i] == 0){
               res[i] = -1;
           }
        }
        return res;
   }

   public static void main(String[] args) {
    Next_Greater_El arr = new Next_Greater_El();

    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};

    int[] result = arr.nextGreaterElement(nums1, nums2);

    System.out.print("Result: ");
    for (int val : result) {
        System.out.print(val + " ");
    }
   }
}
