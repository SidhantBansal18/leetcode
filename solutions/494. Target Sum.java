class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        HashMap<HashMap<Integer, Integer>, Integer> dp = new HashMap<>();
        
        return backtrack(dp, nums, target, 0, 0);
                
    }
    
    public int backtrack(HashMap<HashMap<Integer, Integer>, Integer> dp, int[] nums, int target, int index, int total){
        
        HashMap<Integer, Integer> temp = new HashMap();
        temp.put(index, total);
        
        if(index == nums.length){
            return total == target? 1 : 0;
        }
        
        if(dp.containsKey(temp)){
            return dp.get(temp);
        }
        
        int sum = backtrack(dp, nums, target, index+1, total+nums[index]) + backtrack(dp, nums, target, index+1, total-nums[index]);
        
        dp.put(temp, sum);
        
        return sum;
    } 
}
