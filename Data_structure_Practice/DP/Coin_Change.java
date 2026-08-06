package Data_structure_Practice.DP;

import java.util.Arrays;

public class Coin_Change {
    public static int coinchange(int[] coins, int amount){
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i]; j <= amount; j++){
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }   
    
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println(coinchange(coins, amount));
    }
}
