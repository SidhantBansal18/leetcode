class Solution {
    public boolean canJump(int[] nums) {
        
        int result = nums[0];
        
        for(int i = 0; i < nums.length-1; i++){
            
            result--;
            result = Math.max(result, nums[i]);
            
            if(result == 0){
                return false;
            }
        }
        
        return true;
    }
}
