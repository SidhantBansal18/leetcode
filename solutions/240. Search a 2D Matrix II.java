class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return false;
        }
        int row = 0; 
        int col = matrix[0].length-1;
        
        //Eliminate columns and rows by starting from the top right corner of the matrix
        while(col >= 0 && row <= matrix.length-1){
            if(target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else if(target > matrix[row][col]){
                row++;
            }
        }
        
        return false;
    }
}
