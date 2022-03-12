class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result = new ArrayList();
        
        List<Integer> temp = new ArrayList();
        
        generateCombinations(result, temp, n, k, 1);
        
        return result;
        
    }
    
    public void generateCombinations(List<List<Integer>> result, List<Integer> temp, int n, int k, int current){
        
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
        }
        
        for(int i = current; i < n+1; i++){
            temp.add(i);
            generateCombinations(result, temp, n, k, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
