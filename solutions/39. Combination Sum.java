class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();
        helper(0, result, temp ,candidates, target);
        return result;
        
    }
    
    public void helper(int start,List<List<Integer>> result, List<Integer> temp ,int[] candidates ,int remaining){
        
        if(start > candidates.length && remaining != 0){
            return;
        }
        
        if(remaining == 0){
            result.add(new ArrayList(temp));
            return;
        }
        
        if(remaining < 0){
            return;
        }
        
        for(int i = start; i < candidates.length; i++){
            temp.add(candidates[i]);
            helper(i, result, temp, candidates, remaining-candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}
