package Data_structure_Practice.Arrays;

public class Maximum_subarray {
    public static int maxiarr(int [] arr){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int i = 0,j = 0;

        while (j < arr.length) {
            if (j < 0 && arr[j] >= sum) {
                sum = 0;
                i = j;
            }

            sum += arr[j];
            maxi = Math.max(maxi, sum);
            j++;
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxiarr(arr));
    }
}
