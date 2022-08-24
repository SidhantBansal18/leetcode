class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int overallMax = 0;
        int[] dp = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            int max = 0;
            
            for(int j = 0; j < i; j++){
                
                if(nums[j] < nums[i]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
                
            }
            
            dp[i] = max+1;
            if(dp[i] > overallMax){
                overallMax = dp[i];
            }
            
        }
        
        return overallMax;
        
    }
}
