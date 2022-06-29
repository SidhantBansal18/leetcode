class Solution {
    public int minDistance(String word1, String word2) {
        
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        
        for(int row = 0; row <= word1.length(); row++){
            for(int col = 0; col <= word2.length(); col++){
                if(row == 0 || col == 0){
                    continue;
                }
                else if(word1.charAt(row-1) == word2.charAt(col-1)){
                    dp[row][col] = dp[row-1][col-1] + 1;
                }
                else{
                    dp[row][col] = Math.max(dp[row-1][col], dp[row][col-1]);
                }
            }
        }
        
        int minMoves = (word1.length() + word2.length()) - (2 * dp[word1.length()][word2.length()]);
        return minMoves;
        
    }
}
