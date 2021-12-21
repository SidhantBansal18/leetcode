class Solution {
    public int[][] generateMatrix(int n) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n-1;
        int colEnd = n-1;
        int[][] result = new int[n][n];
        int lastResult = 0;
        
        while(rowStart <= rowEnd && colStart <= colEnd){
            
            //Traverse Right
            for(int i = colStart; i <= colEnd; i++){
                result[rowStart][i] = lastResult + 1;
                lastResult++;
            }
            rowStart++;
            
            //Traverse Down
            for(int i = rowStart; i <= rowEnd; i++){
                result[i][colEnd] = lastResult + 1;
                lastResult++;
            }
            colEnd--;
            
                if(rowStart < rowEnd){
                    
                    //Traverse Left
                    for(int i = colEnd; i >= colStart; i--){
                        result[rowEnd][i] = lastResult + 1;
                        lastResult++;
                    }
                    rowEnd--;
                    
                    //Traverse Up
                    for(int i = rowEnd; i >= rowStart; i--){
                        result[i][colStart] = lastResult + 1;
                        lastResult++;
                    }
                    colStart++;
            }
        }
        return result;
    }
}
