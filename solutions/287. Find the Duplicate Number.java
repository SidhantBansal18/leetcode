class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        
        while(left < right){
            int mid = left + (right-left)/2;
            
            if(nums[mid] >= mid+1){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
