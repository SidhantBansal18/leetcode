class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList();
        
        for(int i = 0; i < nums.length; i++){
            
            int toFind = 0 - nums[i];
            int start = i+1;
            int end = nums.length-1;
            
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
​
                while(start < end){
​
                    int sum = nums[start] + nums[end];
                    
                    if(sum == toFind){
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while(start < end && nums[start] == nums[start+1])  start++;
                        while(start < end && nums[end] == nums[end-1])  end--;
                    }
​
                    if(sum < toFind){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }
        
        return result; 
        
    }
}
