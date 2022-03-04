class Solution {
    public int[] sortedSquares(int[] nums) { 
        
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int curr = j;
        
        while(i <= j){
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];
            
            if(val1 < val2){
                res[curr] = val2;
                j--;
            }
            else{
                res[curr] = val1;
                i++;
            }
            curr--;
        }
        
        return res;
    }
}
