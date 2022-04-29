class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()) return false;
        if(s.length() == 0) return false;
        
        for(int i = 0; i < s.length(); i++){
            if(rotate(s,goal,i)){
                return true;
            }
        }
        return false;
    }
    
    public boolean rotate(String s, String goal, int rotation){
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt((i+rotation) % s.length()) != goal.charAt(i)){
                return false;
            } 
        }
        return true;
        
    }
}
