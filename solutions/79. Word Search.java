class Solution {
    public boolean exist(char[][] board, String word) {
        
        int rowCount = board.length;
        int colCount = board[0].length;
        boolean[][] visited = new boolean[rowCount][colCount];
        
        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                
                if(board[i][j] == word.charAt(0)){
                    if (bfs(board, word, i, j, 0, visited)){
                        return true;
                    }
                }                
            }
        }
        
        return false;
    }
    
    public boolean bfs(char[][] board, String word, int row, int col, int currWordIndex, boolean[][] visited){
        
        if(currWordIndex == word.length()){
            return true;
        }
        
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(currWordIndex)){
            return false; 
        }
        
        
        visited[row][col] = true;
        boolean result = bfs(board, word, row+1, col, currWordIndex+1, visited)
            || bfs(board, word, row-1, col, currWordIndex+1, visited)
            || bfs (board, word, row, col+1, currWordIndex+1, visited)
            || bfs(board, word, row, col-1, currWordIndex+1, visited);
        
        visited[row][col] = false; 
        return result; 
        
    }
}
