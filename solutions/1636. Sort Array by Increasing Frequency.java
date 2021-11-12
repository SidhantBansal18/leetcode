class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        Queue<Integer> queue = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                if(map.get(a) < map.get(b)){
                    return -1;
                }
                else if(map.get(a) > map.get(b)){
                    return 1;
                }
                else{
                    if(a < b){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
            }
        }
            //(a,b) -> map.get(a) - map.get(b)
        );
        
        for(int i : map.keySet()){
            queue.offer(i);
        }
        
        List<Integer> res = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            if(queue.isEmpty()) break;
            int temp = map.get(queue.peek());
            while(temp > 0){
                res.add(queue.peek());
                temp--;
            }
            queue.poll();
        }
        
        int[] result = new int[res.size()];
        for(int i =0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
