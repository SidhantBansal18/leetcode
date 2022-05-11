class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int dirX = 0;
        int dirY = 1;
        int x = 0;
        int y = 0;
        
        for(char inst: instructions.toCharArray()){
            
            if(inst == 'G'){
                x = x + dirX;
                y = y + dirY;
            }
            
            else if(inst == 'L'){
                int tempX = dirX;
                dirX = -1*dirY;
                dirY = tempX;
            }
            
            else if(inst == 'R'){
                int tempX = dirX;
                dirX = dirY;
                dirY = -1*tempX;
            }
        }
        
        if((x == 0 && y == 0) || (dirX != 0 || dirY != 1)){
            return true;
        }
        
        
        return false;
    }
}
