class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        Map<Integer, List<Integer>> prereq = new HashMap();
        
        for(int i = 0; i < numCourses; i++){
            
            prereq.put(i, new ArrayList<Integer>());
            
        }
        
        for(int i = 0; i < prerequisites.length; i++){
            
            List<Integer> curr = prereq.get(prerequisites[i][0]);
            curr.add(prerequisites[i][1]);
            prereq.put(prerequisites[i][0], curr);
            
        }
        
        Set<Integer> visited = new HashSet();
        for(int i = 0; i < prerequisites.length; i++){
            
            if(!bfs(prerequisites[i][0], prereq, visited)){
                return false; 
            }
            
        }
        
        return true;
    }
    
    public boolean bfs(int currCourse, Map<Integer, List<Integer>> map, Set<Integer> visited){
        
        if(visited.contains(currCourse)){
            return false; 
        }
        
        visited.add(currCourse);
        List<Integer> currList = map.get(currCourse);
        for(int i = 0; i < currList.size(); i++){
            if(!bfs(currList.get(i), map, visited)){
                return false; 
            }
        }
        
        visited.remove(currCourse);
        map.put(currCourse, new ArrayList<Integer>());
        return true;
    }
}
