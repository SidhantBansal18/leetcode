class Solution {
    public int minOperations(int[] nums, int x) {
        
        int totalSum = 0;
        for(int num: nums){
            totalSum += num;
        }
        
        int currSum = 0;
        int maxLength = -1;
        for(int left = 0, right = 0; right < nums.length; right++){
            currSum += nums[right];
            
            while(left <= right && currSum > totalSum - x){
                currSum -= nums[left];
                left++;
            }
            
            if(currSum == totalSum - x){
                maxLength = Math.max(maxLength, right-left+1);
            }
        }
        
        return maxLength == -1? -1 : nums.length-maxLength ;
    }
}
