class Solution {
    public int totalFruit(int[] fruits) {
        
        int lastFruit = -1;
        int secondLastFruit = -1;
        int currMax = 0;
        int lastFruitCount = 0;
        int result = 0;
        
        for(int currentFruit: fruits){
            
            if(currentFruit == lastFruit || currentFruit == secondLastFruit){
                currMax++;
            }
            else{
                currMax = lastFruitCount + 1;
            }
            
            if(currentFruit == lastFruit){
                lastFruitCount++;
            }
            else{
                lastFruitCount = 1;
            }
            
            if(currentFruit != lastFruit){
                secondLastFruit = lastFruit;
                lastFruit = currentFruit;
            }
            
            result = Math.max(result, currMax);
        }
        
        return result;
    }
}
