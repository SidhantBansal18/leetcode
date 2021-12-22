class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //O(1) space approach
        int len = nums.length;
        
        int[] leftProd = new int[len];
        
        leftProd[0] = 1;
        for(int i = 1; i < len; i++){
            leftProd[i] = leftProd[i-1] * nums[i-1];
        }
        
        int tempRes = 1;
        for(int i = len-1; i >=0; i--){
            leftProd[i] = tempRes * leftProd[i];
            tempRes *= nums[i];
        }
        
        return leftProd;
    }
}
