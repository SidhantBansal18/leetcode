class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet();
        
        for(int num : nums){
            set.add(num);
        }
        
        int longestStreak = 0;
        
        for(int num: nums){
            
            if(!set.contains(num-1)){
                
                int currentStreak = 1;
                int currentNum = num;
                
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak ++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
            
        }
        
        return longestStreak;
    }
}
