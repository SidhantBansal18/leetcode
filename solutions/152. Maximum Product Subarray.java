class Solution {
    public int maxProduct(int[] nums) {
        
        int minSoFar = nums[0];
        int maxSoFar = nums[0];
        int maxProduct = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            int curr = nums[i];
            int temp = maxSoFar;
            maxSoFar = Math.max(curr, Math.max(curr*maxSoFar, curr*minSoFar));
            minSoFar = Math.min(curr, Math.min(curr*minSoFar, curr* temp));
            maxProduct = Math.max(maxSoFar, maxProduct);
        }
        
        return maxProduct;
    }
}
