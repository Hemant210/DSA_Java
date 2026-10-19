package Top_Interview_150;

public class buy_sell_I {
    public static int Max_profit(int[] prices) {

        if (prices == null || prices.length <= 1)
            return 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(Max_profit(prices));
    }
}
