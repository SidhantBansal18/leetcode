class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList();
        
        backtrack(nums, result, temp, 0);
        
        return result;
    }
    
    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> temp, int start){
        
        result.add(new ArrayList<>(temp));
        
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1])   continue;
            temp.add(nums[i]);
            backtrack(nums, result, temp, i+1);
            temp.remove(temp.size()-1);
        }
        
    }
}
