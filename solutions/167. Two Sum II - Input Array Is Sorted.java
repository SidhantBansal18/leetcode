class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length-1;
        
        int[] ans = new int[2];
        
        while(left < right){
            int currSum = numbers[left] + numbers[right];
            if(currSum == target){
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }
            if(currSum < target){
                left++;
            }
            else{
                right--;
            }
        }
        
        return ans; 
        
        
    }
}
​
//26:42
