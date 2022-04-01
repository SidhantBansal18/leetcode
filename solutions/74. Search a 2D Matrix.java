class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int right = (row * col)-1;
        
        
        while(left <= right){
            int mid = left + (right-left)/2;
            int midElement = matrix[mid/col][mid%col];
            if(midElement == target){
                return true;
            }
            else if(target > midElement){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return false;
    }
}
