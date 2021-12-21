class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        swap(matrix);
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
    
    public void swap(int[][] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            for(int i = 0; i < arr.length; i++){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
            }
            start++;
            end--;
        }
    }
}
