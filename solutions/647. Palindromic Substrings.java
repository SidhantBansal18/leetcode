class Solution {
    public int countSubstrings(String s) {
        
        boolean[][] dp = new boolean[s.length()][s.length()];
        int palindromes = 0;
        
        for(int i = 0; i <  dp.length; i++){
            
            for(int j = 0, k = i ; k < dp[0].length; j++, k++){
                
                if(i == 0){
                    dp[j][k] = true;
                    palindromes++;                    
                }
                
                else if(i == 1){
                    if(s.charAt(j) == s.charAt(k)){
                        dp[j][k] = true;
                        palindromes++;
                    }
                }
                
                else{
                    
                    if(s.charAt(j) == s.charAt(k) && dp[j+1][k-1]){
                        dp[j][k] = true;
                        palindromes++;
                    }
                    
                }
                
            }
            
        }
        
        return palindromes;
        
    }
}
