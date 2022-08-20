class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left < right){
            
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        
        int originalStart = left;
        left = 0;
        right = nums.length-1;
        
        if(target >= nums[originalStart] && target <= nums[right]){
            left = originalStart;
        }
        else{
            right = originalStart;
        }
        
        while(left <= right){
            
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
            
