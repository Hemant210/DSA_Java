package Data_structure_Practice.Binary_Search;

public class Koko_Bananas {
    public static int mineatingspeed(int[] piles, int h){
        int low = 1;
        int high = 0;

        for(int i = 0; i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low)/2;
            int time = 0;

            for(int i = 0; i < piles.length; i++){
                time += (long)(piles[i] - 1)/mid + 1;
            }

            if (time <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println("Koko Eating Bananas :- " + mineatingspeed(piles, h));
    }
}
