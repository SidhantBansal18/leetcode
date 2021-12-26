class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m == 1 && n == 1){
            return 1;
        }
        
        int[][] memo = new int[m+1][n+1];
        
        for (int i = 0; i < m; ++i) { // init
            for (int j = 0; j < n; ++j) {
                memo[i][j] = -1;
            }
        }
        
        return helper(m-1,n-1, memo);
    }
    
    //Top down approach after removing Arrays.fill();
    
    public int helper(int row, int column, int[][] memo){
        
        if(row < 0 || column < 0){
            return 0;
        }
        
        if((row == 1 && column == 0) || (row == 0 && column == 1)){
            if(memo[row][column] == -1){
                memo[row][column] = 1;
            }
            return memo[row][column];
        }
        
        if(memo[row][column] == -1){
            memo[row][column] = helper(row-1,column, memo) + helper(row,column-1, memo);
        }
        
        return memo[row][column];
    }
}
