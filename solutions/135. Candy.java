class Solution {
    public int candy(int[] ratings) {
        
        int[] leftNeighbors = new int[ratings.length];
        int[] rightNeighbors = new int[ratings.length];
        
        leftNeighbors[0] = 1;
        rightNeighbors[rightNeighbors.length-1] = 1;
        
        for(int index = 1; index < leftNeighbors.length; index++){
            
            if(ratings[index] > ratings[index-1]){
                leftNeighbors[index] = leftNeighbors[index-1] + 1;
            }
            else{
                leftNeighbors[index] = 1;
            }
            
        }
        
        for(int index = rightNeighbors.length-2; index >= 0; index--){
            
            if(ratings[index] > ratings[index+1]){
                rightNeighbors[index] = rightNeighbors[index+1] + 1;
            }
            else{
                rightNeighbors[index] = 1;
            }
            
        }
        
        int minCandies = 0;
        int[] finalCandies = new int[ratings.length];
        
        for(int i = 0; i < finalCandies.length; i++){
            finalCandies[i] = Math.max(leftNeighbors[i], rightNeighbors[i]);
            minCandies += finalCandies[i];
        }
        
        return minCandies;
    }
}
