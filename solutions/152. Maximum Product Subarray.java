class Solution {
    public int maxProduct(int[] nums) {
        
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            int curr = nums[i];
            
            int temp = maxSoFar;
            maxSoFar = Math.max(curr, Math.max(curr* minSoFar, curr*maxSoFar));
            minSoFar = Math.min(curr, Math.min(curr* minSoFar, curr*temp));
            
            result = Math.max(maxSoFar, result);
        }
        
        return result; 
    }
}
