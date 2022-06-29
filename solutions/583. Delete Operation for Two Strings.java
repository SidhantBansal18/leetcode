class Solution {
    public int minDistance(String word1, String word2) {
        
        int[][] dp = new int[word1.length()][word2.length()];
        
        for(int col = 0; col < dp[0].length; col++){
            if(word1.charAt(0) == word2.charAt(col)){
                dp[0][col] = 1;
            }
            else{
                dp[0][col] = col != 0? dp[0][col-1]: 0;
            }
        }
        
        for(int row = 0; row < dp.length; row++){
            if(word1.charAt(row) == word2.charAt(0)){
                dp[row][0] = 1;
            }
            else{
                dp[row][0] = row != 0? dp[row-1][0]: 0;
            }
        }
        
        for(int row = 1; row < dp.length; row++){
            char firstChar = word1.charAt(row);
            for(int col = 1; col < dp[0].length; col++){
                char secondChar = word2.charAt(col);
                if(firstChar == secondChar){
                    dp[row][col] = dp[row-1][col-1] + 1;
                }
                else{
                    dp[row][col] = Math.max(dp[row-1][col], dp[row][col-1]);
                }
            }
        }
        
        int minMoves = word1.length()+word2.length() - (dp[dp.length-1][dp[0].length-1] * 2);
        return minMoves;
    }
}
