class Solution {
    public int longestConsecutive(int[] nums) {
        
        int max = 0;
        Set<Integer> set = new HashSet();
        
        for(int num: nums){
            set.add(num);
        }
        
        for(int i = 0; i < nums.length; i++){
            
            int currMax = 0;
            int currNum = nums[i];
            
            if(!set.contains(currNum-1)){
                while(set.contains(currNum)){
                    currMax++;
                    currNum++;                    
                }
                
            }
            
            max = Math.max(max, currMax);
        }
        
        return max;
    }
}
