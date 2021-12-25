class Solution {
    public int climbStairs(int n) {
        return helper(n, new int[n+1]);
    }
    
    //Top down approach
    public int helper(int n, int[] memo){
        if(n == 1)  return 1;
        if(n == 2)  return 2;
        
        if(memo[n] == 0){
            memo[n] = helper(n-1, memo) + helper(n-2, memo);
        }
        
        return memo[n];
    }
}
