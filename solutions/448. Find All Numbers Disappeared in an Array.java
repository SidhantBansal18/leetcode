class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList();
        int[] check = new int[nums.length+1];
        
        for(int i : nums){
            check[i]++;
        }
        
        for(int i = 1; i < check.length; i++){
            if(check[i] == 0){
                result.add(i);
            }
        }
        
        return result;
    }
}
