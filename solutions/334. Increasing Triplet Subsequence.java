class Solution {
    public boolean increasingTriplet(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        
        int[] leftMin = new int[nums.length]; // Left min of every element
        
        int[] rightMax = new int[nums.length]; // Right max of every element
        
        leftMin[0] = Integer.MAX_VALUE;
        for(int i = 1; i < leftMin.length; i++){
            leftMin[i] = Math.min(leftMin[i-1], nums[i-1]);
        }
        
        rightMax[rightMax.length-1] = Integer.MIN_VALUE;
        for(int i = rightMax.length-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], nums[i+1]);
        }
        
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] > leftMin[i] && nums[i] < rightMax[i]){
                return true;
            }
        }
        return false;
    }
}
