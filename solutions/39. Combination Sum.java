class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList();
        
        List<Integer> temp = new ArrayList();
        
        helper(result, temp, candidates, target, 0);
        
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        if(target < 0){
            return;
        }
        
        for(int i = start; i < candidates.length; i++){
            temp.add(candidates[i]);
            helper(result, temp, candidates, target-candidates[i], i);
            temp.remove(temp.size()-1);
        }
    }
}
