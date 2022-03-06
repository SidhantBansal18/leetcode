class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> row = new HashSet();
        Set<Integer> column = new HashSet();
        
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                if(matrix[r][c] == 0){
                    row.add(r);
                    column.add(c);
                }
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(row.contains(i) || column.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}
