class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> frequency = new HashMap();
        
        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num,0) + 1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)->frequency.get(b)-frequency.get(a));
        
        for(Map.Entry<Integer, Integer> map: frequency.entrySet()){            
            queue.add(map.getKey());            
        }
        
        int[] ans = new int[k];
        
        for(int i = 0; i < ans.length; i++){
            ans[i] = queue.remove();
        }
        
        return ans; 
    }
}
