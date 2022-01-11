class Solution {
    public boolean canFinish(int numCourses, int[][] prereq) {
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        
        for(int i = 0; i < numCourses; i++){
            map.put(i, new ArrayList<Integer>());
        }
        
        for(int[] pre : prereq){
            ArrayList<Integer> temp = map.get(pre[0]);
            temp.add(pre[1]);
            map.put(pre[0], temp);
        }
        
        System.out.println(map);
        
        Set<Integer> visited = new HashSet();
        
        for(int[] pre : prereq){
            if(!helper(pre[0], map, visited)){
                return false; 
            }
        }
        
        
        return true;
    }
    
    public boolean helper(int course, Map<Integer, ArrayList<Integer>> map, Set<Integer> visited){
        
        if(visited.contains(course)){
            return false;
        }
        if(map.get(course).size() == 0){
            return true;
        }
        
        visited.add(course);
        for(int i = 0; i < map.get(course).size(); i++){
            if(!helper(map.get(course).get(i), map, visited)){
                return false;
            }
        }
        visited.remove(course);
        ArrayList<Integer> temp = new ArrayList();
        map.put(course, temp);
        return true;
    }
}
