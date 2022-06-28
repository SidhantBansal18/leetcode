class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> indexing = new HashMap();
        int[] prefixSum = new int[nums.length + 1];
        
        int maxScore = 0;
        
        for(int left = 0, right = 0; right  < nums.length; right++){
            prefixSum[right+1] = prefixSum[right] + nums[right];
            
            if(indexing.containsKey(nums[right])){
                left = Math.max(left, indexing.get(nums[right]) + 1);
            }
            
            maxScore = Math.max(maxScore, prefixSum[right+1] - prefixSum[left]);
            
            indexing.put(nums[right], right);
        }
        
        return maxScore; 
    }
}
