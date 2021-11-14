class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList();
        
        for(String s : words){
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == s.charAt(0) && dfs(board,i,j,s,0)){
                        if(!result.contains(s)){
                            result.add(s);
                        }
                    }
                }
            }
        }
        return result;
    }
    
    public boolean dfs(char[][] board, int i, int j, String word, int index){
        if(index == word.length()){
            return true;
        }
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)){
            return false;
