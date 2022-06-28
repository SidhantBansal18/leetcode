class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int left = 0;
        int globalSum = nums[left];
        int localSum = nums[left];
        Map<Integer, Integer> indexing = new HashMap();
        indexing.put(nums[left], 0);
        int right;
        
        for(right = 1; right < nums.length; right++){
            
            if(indexing.containsKey(nums[right])){
                
                globalSum = Math.max(localSum, globalSum);
                
                int value = indexing.get(nums[right]) + 1;
                while(left < value && left < right){
                    localSum -= nums[left];
                    left++;
                }
                
            }
            
            localSum += nums[right];
            
            indexing.put(nums[right], right);
        }
        
        return Math.max(globalSum, localSum);
    }
}
