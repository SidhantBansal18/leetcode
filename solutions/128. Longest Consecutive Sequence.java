class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet();
        
        for(int num : nums){
            set.add(num);
        }
        
        int max_length = 0;
        
        for(int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            int curr_length = 1;
            
            if(!set.contains(currentNum-1)){
                
                while(set.contains(currentNum+1)){
                    currentNum += 1;
                    curr_length += 1;
                }
                
                max_length = Math.max(max_length, curr_length);
            }
        }
        
        return max_length;
    }
}
