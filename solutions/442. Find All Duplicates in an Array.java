class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int[] occurence = new int[nums.length + 1];
        
        for(int num : nums){
            occurence[num]++;
        }
        
        List<Integer> result = new ArrayList();
        
        for(int i = 0; i < occurence.length; i++){
            if(occurence[i] == 2){
                result.add(i);
            }
        }
        
        return result;
    }
}
