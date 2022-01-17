class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int consecutiveMax = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                consecutiveMax += 1;
            }
            
            else{
                max = Math.max(max, consecutiveMax);
                consecutiveMax = 0;
            }
        }
        
        return Math.max(max, consecutiveMax);
    }
}
