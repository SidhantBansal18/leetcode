class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList();
        
        List<Integer> temp = new ArrayList();
        
        generatePermutations(nums, result, temp);
        
        return result;
        
    }
    
    public void generatePermutations(int[] nums, List<List<Integer>> result, List<Integer> temp){
        
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
        }
        
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i]))  continue;
            temp.add(nums[i]);
            generatePermutations(nums, result, temp);
            temp.remove(temp.size()-1);
        }
    }
}
