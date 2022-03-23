class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        Queue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        int result;
        
        for(result = 0; startFuel < target; result++){
            
            while(index < stations.length && stations[index][0] <= startFuel){
                pq.offer(-stations[index++][1]);
            }
            if(pq.isEmpty())    return -1;
            startFuel += -pq.poll();
            
        }
        
        return result;
        
    }
}
