class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];
        
        leftProd[0] = 1;
        rightProd[rightProd.length-1] = 1;
        
        for(int i = 1; i < leftProd.length; i++){
            leftProd[i] = leftProd[i-1] * nums[i-1];
        }
        
        for(int i = rightProd.length-2; i >= 0; i--){
            rightProd[i] = rightProd[i+1] * nums[i+1];
        }
        
        int[] res = new int[nums.length];
        
        for(int i = 0; i < res.length; i++){
            res[i] = leftProd[i] * rightProd[i];
        }
        
        return res;
    }
}
​
