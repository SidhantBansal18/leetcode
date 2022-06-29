class Solution {
    public int minDistance(String word1, String word2) {
        
        int[][] memo = new int[word1.length()+1][word2.length()+1];
        
        return word1.length() + word2.length() - 2 * (lcs(word1, word2, word1.length(), word2.length(), memo));
    }
    
    public int lcs(String word1, String word2, int index1, int index2, int[][] memo){
        
        
        if(index1 == 0 || index2 == 0){
            return 0;
        }
        
        if(memo[index1][index2] > 0){
            return memo[index1][index2];
        }
        
        if(word1.charAt(index1-1) == word2.charAt(index2-1)){
            memo[index1][index2] = 1 + lcs(word1, word2, index1 - 1, index2 - 1, memo);
        }
        
        else{
            memo[index1][index2] = Math.max(lcs(word1, word2, index1-1, index2, memo), lcs(word1, word2, index1, index2-1, memo));
        }
        return memo[index1][index2];
    }
}
