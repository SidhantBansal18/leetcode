class Solution {
    public String longestPalindrome(String s) {
        
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLength = 0;
        int maxRow = 0;
        int maxCol = 0;
        
        for(int i = 0; i <  dp.length; i++){
            
            for(int j = 0, k = i ; k < dp[0].length; j++, k++){
                
                if(i == 0){
                    dp[j][k] = true;
                }
                
                else if(i == 1){
                    if(s.charAt(j) == s.charAt(k)){
                        dp[j][k] = true;
                        int currLength = k-j;
                        if(currLength > maxLength){
                            maxRow = j;
                            maxCol = k;
                            maxLength = currLength;
                        }
                    }
                }
                
                else{
                    
                    if(s.charAt(j) == s.charAt(k) && dp[j+1][k-1]){
                        dp[j][k] = true;
                        int currLength = k-j;
                        if(currLength > maxLength){
                            maxRow = j;
                            maxCol = k;
                            maxLength = currLength;
                        }
                    }
                    
                }
                
            }
            
        }
        
        return s.substring(maxRow, maxCol+1).toString();
        
    }
}
