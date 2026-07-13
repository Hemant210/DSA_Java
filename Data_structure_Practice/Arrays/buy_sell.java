package Data_structure_Practice.Arrays;

public class buy_sell {
    public static int Max_profit(int[] prices) {
        int profit = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < n; j++) {
                int sell = prices[j];

                profit = Math.max(profit, sell - buy);
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        buy_sell s = new buy_sell();

        int result = s.Max_profit(prices);

        System.out.println(result);
    }
}
