class Solution {
    public boolean canFinish(int numCourses, int[][] prereq) {
        
        HashMap<Integer, ArrayList<Integer>> courses = new HashMap();
        
        for(int i = 0; i < numCourses; i++){
            courses.put(i, new ArrayList());
        }
        
        for(int i = 0; i < prereq.length; i++){
            ArrayList<Integer> list = courses.get(prereq[i][0]);
            list.add(prereq[i][1]);
        }
        
        HashSet<Integer> visited = new HashSet();
        
        for(int i = 0; i < prereq.length; i++){
            if(!helper(prereq[i][0], courses, visited)){
                return false;
            }
        }
        
        return true;
        
    }
    
    public boolean helper(int currCourse, HashMap<Integer, ArrayList<Integer>> courses, Set<Integer> visited){
        
        if(visited.contains(currCourse)){
            return false;
        }
        
        visited.add(currCourse);
        ArrayList<Integer> currPreq = courses.get(currCourse);
        for(int i = 0; i < currPreq.size(); i++){
            if(!helper(currPreq.get(i), courses, visited)){
                return false;
            }
        }
        visited.remove(currCourse);
        courses.put(currCourse, new ArrayList<Integer>());
        return true;
    }
}
