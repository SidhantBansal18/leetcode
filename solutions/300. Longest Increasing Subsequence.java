class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int dp[] = new int[nums.length];
        int globalMax = 1;
        
        Arrays.fill(dp, 1);
        
        
        for(int forward = 1; forward < nums.length; forward++){
            for(int behind = 0; behind < forward; behind++){
                
                if(nums[behind] < nums[forward]){
                    dp[forward] = Math.max(dp[forward], dp[behind] + 1);
                    globalMax = Math.max(dp[forward], globalMax);
                }
            }
        }
        
        return globalMax;
    }
}
