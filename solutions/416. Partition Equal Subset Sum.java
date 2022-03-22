class Solution {
    public boolean canPartition(int[] nums) {
        
        int total = 0;
        
        for(int num: nums){
            total += num;
        }
        
        if(total%2 != 0){
            return false;
        }
        
        Map<String, Boolean> state = new HashMap();
        
        return canPartition(nums, 0, 0, total, state);
    }
    
    public boolean canPartition(int[] nums, int index, int sum, int total, Map<String, Boolean> state){
        
        String current = index + "" + sum;
        if(state.containsKey(current)){
            return state.get(current);
        }
        
        if(sum * 2 == total){
            return true;
        }
        
        if(sum * 2 > total || index >= nums.length){
            return false;
        }
        
        boolean res = canPartition(nums, index+1, sum, total, state) || canPartition(nums, index+1, sum+nums[index], total, state);
        
        state.put(current, res);
        return res;
    }
}
