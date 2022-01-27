class Solution {
    public void rotate(int[][] matrix) {
        
        transpose(matrix);
        rotate(matrix,0,matrix[0].length-1);
    }
    
    public void transpose(int[][] matrix){
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                
                if(i != j && i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
                
            }
        }
    }
    
    public void rotate(int[][] matrix, int start, int end){
        
        while(start < end){
            
            for(int i = 0; i < matrix[0].length; i++){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
            start++;
            end--;
        }
        
    }
}
