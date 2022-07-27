class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int currSum = 0;
        
        //If the preceding sum is negative then the sum will start from the current value otherwise update the existing sum
        
        for(int i = 0; i < nums.length; i++){
            
            if(currSum < 0){
                currSum = nums[i];
            }
            else{
                currSum += nums[i];
            }
            
            
            maxSum = Math.max(currSum, maxSum);
        }
        
        return maxSum; 
        
    }
}
