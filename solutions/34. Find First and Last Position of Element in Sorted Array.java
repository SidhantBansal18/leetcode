class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = helperForFirst(nums, target);
        res[1] = helperForSecond(nums, target);
        return res;
    }
    
    public int helperForFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) res = mid;
            if(nums[mid] >= target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
    
    public int helperForSecond(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) res = mid;
            if(nums[mid] <= target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }
}
