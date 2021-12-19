class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList();
        
        result.add(Arrays.asList(1));
        
        if(rowIndex == 0)   return result.get(rowIndex);
        
        for(int i = 1; i <= rowIndex; i++){
            List<Integer> row = new ArrayList();
            List<Integer> prev = result.get(i-1);
            
            row.add(1);
            
            for(int j = 0; j < prev.size()-1; j++){
                row.add(prev.get(j) + prev.get(j+1));
            }
                
            row.add(1);
            result.add(row);
        }
        
        return result.get(rowIndex);
    }
}
