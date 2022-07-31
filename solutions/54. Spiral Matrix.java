class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList();
        int firstRow = 0;
        int lastRow = matrix.length-1;
        int firstCol = 0;
        int lastCol = matrix[0].length-1;
        
        while(firstRow <= lastRow && firstCol <= lastCol){
            
            for(int i = firstCol; i <= lastCol; i++){
                result.add(matrix[firstRow][i]);
            }
            firstRow++;
            
            for(int i = firstRow; i <= lastRow; i++){
                result.add(matrix[i][lastCol]);
            }
            lastCol--;
            
            if(firstRow <= lastRow){
​
                for(int i = lastCol; i >= firstCol; i--){
                    result.add(matrix[lastRow][i]);
                }
            }
            lastRow--;
            
            if(firstCol <= lastCol){
                for(int i = lastRow; i >= firstRow; i--){
                    result.add(matrix[i][firstCol]);
                }
            }
            firstCol++;            
        }
        return result;
    }
}
