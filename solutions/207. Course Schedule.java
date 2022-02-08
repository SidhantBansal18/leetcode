class Solution {
    public boolean canFinish(int numCourses, int[][] prereq) {
        
        Map<Integer,ArrayList<Integer>> map = new HashMap();
        
        for(int i = 0; i < numCourses; i++){
            map.put(i, new ArrayList<Integer>());
        }
        
        for(int[] pre : prereq){
            ArrayList<Integer> list = map.get(pre[0]);
            list.add(pre[1]);
            map.put(pre[0], list);
        }
        
        Set<Integer> visited = new HashSet();
        
        for(int[] pre : prereq){
            if(!helper(pre[0], map, visited)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean helper(int course, Map<Integer,ArrayList<Integer>> map, Set<Integer> visited){
