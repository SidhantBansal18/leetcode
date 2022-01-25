class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();
        boolean[] flags = new boolean[nums.length];
        
        backtrack(nums, result, temp, flags);
        
        return result;
        
    }
    
    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> temp, boolean[] flags){
        
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
        }
        
        else{
            for(int i = 0; i < nums.length; i++){
                if(flags[i] || i > 0 && nums[i] == nums[i-1] && !flags[i-1])  continue;
                flags[i] = true;
                temp.add(nums[i]);
                backtrack(nums, result, temp, flags);
                flags[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}
