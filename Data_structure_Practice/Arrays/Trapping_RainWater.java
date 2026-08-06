package Data_structure_Practice.Arrays;

public class Trapping_RainWater {
    public static int Cal_Trap(int [] height){
        int n = height.length;
        int l = 0, r = n - 1;
        int l_max = 0, r_max = 0;
        int ans = 0;

        while (l < r) {
            l_max = Math.max(l_max, height[l]);
            r_max = Math.max(r_max, height[r]);

            if (l_max < r_max) {
                ans += l_max - height[l];
                l++;
            } else {
                ans += r_max - height[r];
                r--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapping Rain Water :- " + Cal_Trap(arr));
    }
}
