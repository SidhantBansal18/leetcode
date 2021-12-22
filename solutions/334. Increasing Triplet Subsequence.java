class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        //O(1) space approach
        if(nums == null || nums.length <= 2){
            return false;
        }
        
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int num: nums){
            if(num < a) a = num;
            else if(num > a && num < b) b = num;
            else if (num > b) return true;
        }
        
        return false;
    }
}
