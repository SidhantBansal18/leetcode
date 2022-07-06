class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> numbers = new HashSet();
        
        for(int num : nums){
            numbers.add(num);
        }
        
        // if(nums.length == 0)    return 0;
        
        int maxLength = 0;
        
        for(int index = 0; index < nums.length; index++){
​
            int currentNumber = nums[index];
            
            if(!numbers.contains(currentNumber - 1)){
                
                int currLength = 1;
                int numberToSearch = currentNumber + 1;
                while(numbers.contains(numberToSearch)){
                    numberToSearch++;
                    currLength++;
                }
                maxLength = Math.max(currLength, maxLength);
            }
            
        }
        
        return maxLength;
        
    }
}
