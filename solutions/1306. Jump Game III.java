class Solution {
    public boolean canReach(int[] arr, int start) {
        
        HashMap<Integer, ArrayList<Integer>> reachables = new HashMap();
        
        for(int i = 0; i < arr.length; i++){
            reachables.put(i, new ArrayList<Integer>());
        }
        
        for(int i = 0; i < arr.length; i++){
            ArrayList<Integer> reachableNeighbors = reachables.get(i);
            if(i + arr[i] < arr.length){
                reachableNeighbors.add(i+arr[i]);
            }
            if(i - arr[i] >= 0){
                reachableNeighbors.add(i-arr[i]);
            }
            
            reachables.put(i, reachableNeighbors);
        }
        
        HashSet<Integer> visited = new HashSet();
        
        return dfs(arr, start, reachables, visited);
        
    }
    
    public boolean dfs(int[] arr, int start, HashMap<Integer, ArrayList<Integer>> reachables, HashSet<Integer> visited){
        
        if(arr[start] == 0){
            return true;
        }
        
        if(visited.contains(start)){
            return false;
        }
        
        ArrayList<Integer> tempReachables = reachables.get(start);
        // System.out.println();
        boolean result = false;
        for(int i = 0; i < tempReachables.size(); i++){
            
            visited.add(start);
            result = dfs(arr, tempReachables.get(i), reachables, visited);
            if(result == true)  return true; 
            // visited.clear();
            
        }
        
        return result;
        
    }
    
    
}
