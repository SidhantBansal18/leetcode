class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)    return nums[0];
        if(nums.length == 2)    return Math.max(nums[0], nums[1]);
        
        int[] includeFirst = Arrays.copyOfRange(nums, 0, nums.length-1);
        int[] excludeFirst = Arrays.copyOfRange(nums, 1, nums.length);
        
        int[] dp1 = new int[includeFirst.length];
        dp1[0] = includeFirst[0];
        dp1[1] = Math.max(includeFirst[0], includeFirst[1]);
        
        for(int i = 2; i < dp1.length; i++){
            dp1[i] = Math.max(dp1[i-1] , includeFirst[i] + dp1[i-2]);
        }
        
        
        int[] dp2 = new int[excludeFirst.length];
        dp2[0] = excludeFirst[0];
        dp2[1] = Math.max(excludeFirst[0], excludeFirst[1]);
        
        for(int i = 2; i < dp2.length; i++){
            dp2[i] = Math.max(dp2[i-1] , excludeFirst[i] + dp2[i-2]);
        }
        
        
        return Math.max(dp1[includeFirst.length-1],dp2[excludeFirst.length-1] );
    }
}
