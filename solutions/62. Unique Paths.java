class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] arr = new int[m][n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i][arr[0].length-1] = 1;
        }
        
        for(int i = 0; i < arr[0].length; i++){
            arr[arr.length-1][i] = 1;
        }
        
        for(int i = arr.length-2; i >= 0; i--){
            for(int j = arr[0].length-2; j >=0; j--){
                arr[i][j] = arr[i+1][j] + arr[i][j+1];
            }
        }
        
        return arr[0][0];
    }
}
