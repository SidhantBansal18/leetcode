class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        
        dp[0] = 0;
        
        for(int i = 0; i < dp.length; i++){            
            for(int j = 0; j < coins.length; j++){
                
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
                
            }            
        }
        
        return dp[amount] > amount? -1: dp[amount];
    }
}
​
​
//amount = 3
//coins = [1]
//dp[1] = 1
//dp[2] = 2 [(curr amount - coins[0]) = 1]
//dp[3] = 3 [(curr amount - coins[0]) = 2]
