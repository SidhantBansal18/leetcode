class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();
        
        backtrack(result, temp, k, n, 1);
        
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int size, int remaining, int start){
        
        if(remaining < 0){
            return;
        }
        else if(temp.size() == size && remaining == 0){
            result.add(new ArrayList<>(temp));
        }
        else{
            for(int i = start; i < 10; i++){
                temp.add(i);
                backtrack(result, temp, size, remaining-i, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
