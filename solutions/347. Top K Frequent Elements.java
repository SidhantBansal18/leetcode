class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        
        Queue<Integer> queue = new PriorityQueue<>((n1,n2) -> map.get(n1) - map.get(n2));
        for(int i : map.keySet()){
            queue.offer(i);
            if(queue.size() > k){
                queue.poll();
            }
        }
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = queue.poll();
        }
        return res;
    }
}
