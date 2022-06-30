class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);
        
        int minMoves = 0;
        int median;
        if(nums.length <= 1)    return minMoves;
        if(nums.length/2 != 0){
            median = nums[nums.length/2];
        }
        else{
            median = (nums[nums.length/2] + nums[nums.length/2 + 1])/2; 
        }
        
        for(int num : nums){
            if(num < median){
                minMoves += median-num;
            }
            if(num > median){
                minMoves += num-median;
            }
        }
        
        return minMoves; 
    }
}
