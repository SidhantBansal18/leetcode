class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int row = heights.length;
        int col = heights[0].length;
        
        Set<List<Integer>> pacific = new HashSet();        
        Set<List<Integer>> atlantic = new HashSet();
        
        for(int i = 0; i < row; i++){            
            dfs(i, 0, pacific, heights[i][0], heights);
            dfs(i, col-1, atlantic, heights[i][col-1], heights);
        }
        
        for(int i = 0; i < col; i++){
            dfs(0, i, pacific, heights[0][i], heights);
            dfs(row-1, i, atlantic, heights[row-1][i], heights);
        }
        
        List<List<Integer>> result = new ArrayList();
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                List<Integer> curr = Arrays.asList(i,j);
                if(pacific.contains(curr) && atlantic.contains(curr)){
                    result.add(curr);
                }
            }
        }
        
        return result; 
        
    }
    
    public void dfs(int row, int col, Set<List<Integer>> visited, int prevHeight, int[][] heights){
        
        List<Integer> curr = Arrays.asList(row,col);
        
        if(row < 0 || col < 0 || row >= heights.length || col >= heights[0].length || visited.contains(curr) ||heights[row][col] < prevHeight){
            return;
        }
        
        visited.add(curr);
        dfs(row+1, col, visited, heights[row][col], heights);
        dfs(row-1, col, visited, heights[row][col], heights);
        dfs(row, col+1, visited, heights[row][col], heights);
        dfs(row, col-1, visited, heights[row][col], heights);
        
    }
}
