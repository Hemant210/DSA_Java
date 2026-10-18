package Top_Interview_150;

public class buy_sell {
    public static int Max_profit(int[] prices) {
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            int buy = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int sell = prices[j];

                profit = Math.max(profit, sell - buy);
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(Max_profit(prices));
    }
}
