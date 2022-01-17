class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int result = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 1){
                int j = i;
                int res = 0;
                
                while(j < nums.length && nums[j] == 1){
                    res++;
                    j++;
                }
                
                result = Math.max(result, res);
            }
            
        }
        
        if(result == Integer.MIN_VALUE){
            return 0;
        }
        return result;
    }
}
