class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxDiff = 0; 
        for(int i = 0 ; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            maxDiff = Math.max(maxDiff, prices[i] - min);
        }
        return maxDiff;
    }
}
