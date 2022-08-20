class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int finalSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            maxSum = Math.max(maxSum+nums[i], nums[i]);
            finalSum = Math.max(finalSum, maxSum);
        }
        
        return finalSum; 
    }
}
