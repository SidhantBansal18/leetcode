class Solution {
    
    
    public int fib(int n) {
        
        int[] dp = new int[n+1];
        
        return fibWithMem(n, dp);
    }
    
    public int fibWithMem(int n, int[] dp){
        
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
        
        if(dp[n] > 0){
            return dp[n];
        }
        
        dp[n] = fibWithMem(n-1, dp) + fibWithMem(n-2, dp);
        
        return dp[n];
    }
}
