class Solution {
    public void rotate(int[][] matrix) {
        
        transpose(matrix);
        swap(matrix);
        
    }
    
    public void transpose(int[][] matrix){
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[0].length; j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
    }
    
    public void swap(int[][] matrix){
        
        int left = 0;
        int right = matrix[0].length-1;
        while(left < right){
            for(int i = 0; i < matrix.length; i++){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            left++;
            right--;
        }
    }
    
}
