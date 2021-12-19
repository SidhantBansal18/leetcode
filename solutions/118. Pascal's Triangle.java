class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        if(numRows == 0)    return result;
        
        
        result.add(Arrays.asList(1));
        
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList();
            List<Integer> prev = result.get(i-1);
            
            row.add(1); // Insert 1 at starting
            
            for(int j = 0; j < prev.size()-1; j++){
                row.add(prev.get(j) + prev.get(j+1));
            }
            
            row.add(1); // Insert 1 at ending
            result.add(row);
        }
        
        return result;
    }
}
