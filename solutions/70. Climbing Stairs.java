class Solution {
    public int climbStairs(int n) {
        return helper(n, new int[n+1]);
    }
    
    //Correct Top down approach
    public int helper(int n, int[] memo){
        
        if(n > 0 && n < 3){
            if(memo[n] == 0){
                memo[n] = n;
            }
            return memo[n];
        }
        
        if(memo[n] == 0){
            memo[n] = helper(n-1, memo) + helper(n-2, memo);
        }
        
        return memo[n];
    }
}
