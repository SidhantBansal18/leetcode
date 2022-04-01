class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        int mid;
        
        while(left < right){
            mid = left + (right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        
        mid = left;
        left = 0;
        right = nums.length-1;
        
        if(target >= nums[mid] && target <= nums[right]){
            left = mid;
        }
        else{
            right = mid;
        }
        
        while(left <= right){
            mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return -1;
    }
