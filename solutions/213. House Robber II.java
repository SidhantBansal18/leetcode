class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1)    return nums[0];
        if(nums.length < 3)    return Math.max(nums[0], nums[1]);
        
        int first = helper(nums, 0, nums.length-1);
        int second = helper(nums, 1, nums.length);
        
        return Math.max(first, second);
    }
    
    
    public int helper(int[] nums, int first, int last){
        
        int[] dp = new int[last-first];
        dp[0] = nums[first];
        if(nums.length < 2) return dp[first];
        
        dp[1] = Math.max(nums[first], nums[first+1]);
        
        for(int i = 2; i < dp.length; i++){
            dp[i] = Math.max(dp[i-1], nums[first+i] + dp[i-2]);
        }
        
        return dp[dp.length-1];
    }
}
