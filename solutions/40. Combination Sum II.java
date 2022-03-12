class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        
        List<List<Integer>> result = new ArrayList();
        
        List<Integer> temp = new ArrayList();
        
        generateCombinationSum(result, temp, candidates, target, 0);
        
        return result;
        
    }
    
    public void generateCombinationSum(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int index){
        
        if(target == 0){
            result.add(new ArrayList<>(temp));
        }
        else if(target < 0){
             return;
        }
        else{
            for(int i = index; i < candidates.length; i++){
                if(i > index && candidates[i] == candidates[i-1])   continue;
                temp.add(candidates[i]);
                generateCombinationSum(result, temp, candidates, target-candidates[i], i+1);
                temp.remove(temp.size()-1);
            }
        } 
    }
}
