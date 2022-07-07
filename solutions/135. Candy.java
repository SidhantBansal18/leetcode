class Solution {
    public int candy(int[] ratings) {
        
        int[] neighbors = new int[ratings.length];
        
        neighbors[0] = 1;
        
        for(int index = 1; index < neighbors.length; index++){
            
            if(ratings[index] > ratings[index-1]){
                neighbors[index] = neighbors[index-1] + 1;
            }
            else{
                neighbors[index] = 1;
            }
            
        }
        
        int minCandies = neighbors[neighbors.length-1];
        
        for(int index = neighbors.length-2; index >= 0; index--){
            
            if(ratings[index] > ratings[index+1]){
                neighbors[index] = Math.max(neighbors[index+1] + 1, neighbors[index]);
            }
            minCandies += neighbors[index];
            // else{
            //     neighbors[index] = 1;
            // }
            
        }
        
        // int minCandies = 0;
//         int[] finalCandies = new int[ratings.length];
        
//         for(int i = 0; i < finalCandies.length; i++){
//             finalCandies[i] = Math.max(leftNeighbors[i], rightNeighbors[i]);
//             minCandies += finalCandies[i];
//         }
        
        return minCandies;
    }
}
