class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        dp[0] = 1;
        
        for(int i = 1; i < nums.length; i++){
            dp[i] = nums[i-1] * dp[i-1];
        }
        
        int toMultiply = 1;
        for(int i = dp.length-1; i >= 0; i--){
            dp[i] = dp[i] * toMultiply;
            toMultiply *= nums[i];
        }
        
        return dp;
    }
}
