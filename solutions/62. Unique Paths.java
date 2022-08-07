class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m == 1 && n == 1)    return 1;
        
        int[][] dp = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        
        return recursion(dp, m-1, n-1);
        
    }
    
    public int recursion(int[][] dp, int m, int n){
        
        if(m < 0 || n < 0){
            return 0;
        }
        
        if((m == 1 && n == 0) || (m == 0 && n == 1)){
            if(dp[m][n] == -1){
                dp[m][n] = 1;
            }   
            return dp[m][n];
        }
        
        if(dp[m][n] == -1){
            dp[m][n] = recursion(dp, m-1, n) + recursion(dp, m, n-1);
        }
        
        return dp[m][n];
    }
}
