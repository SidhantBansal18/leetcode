class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mapping = new HashMap();
        
        for(int i = 0; i < nums.length; i++){
            mapping.put(nums[i], i);
        }
        
        int[] res = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            int toFind = target - nums[i];
            
            if(mapping.containsKey(toFind) && mapping.get(toFind) != i){
                res[0] = i;
                res[1] = mapping.get(toFind);
            }
            
        }
        
        return res;
        
    }
}
