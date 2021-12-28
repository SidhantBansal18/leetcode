class Solution {
    
    //Solving using recursion
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList();
        
        List<Integer> input = new ArrayList();
        
        for(int i : nums){
            input.add(i);
        }
        
        result = helper(input, 0);
        
        return result;
    }
    
    public List<List<Integer>> helper(List<Integer> input, int index){
        
        List<List<Integer>> allSubsets;
        
        //Base Case
        if(index == input.size()){
            allSubsets = new ArrayList();
            allSubsets.add(new ArrayList<>());
        }
        
        else{
            allSubsets = helper(input, index+1);
            List<List<Integer>> moreSubsets = new ArrayList();
            int item = input.get(index);
            
            for(List<Integer> iteratingEachList : allSubsets){
                List<Integer> newList = new ArrayList();
                newList.addAll(iteratingEachList);
                newList.add(item);
                moreSubsets.add(newList);
            }
            
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
        
    }
}
