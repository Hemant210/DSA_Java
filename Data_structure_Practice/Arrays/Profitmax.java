package Data_structure_Practice.Arrays;

public class Profitmax {

    //Time complexity: O(n) & Space complexity: O(1)
    public static int maxprofit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[0] > prices[i]) {
                prices[0] = prices[i];
            }

            profit = Math.max(profit, prices[i] - prices[0]);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxprofit(arr));
    }
}
