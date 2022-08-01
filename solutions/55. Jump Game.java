class Solution {
    public boolean canJump(int[] nums) {
        
        int jumps = 0;
        
        for(int i = 0; i < nums.length-1; i++){
            
            jumps = Math.max(nums[i], jumps);
            
            if(jumps == 0){
                return false;
            }
            
            jumps--;
        }
        
        return true;
    }
}
