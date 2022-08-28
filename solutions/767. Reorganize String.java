class Solution {
    public String reorganizeString(String s) {
        
        Map<Character, Integer> frequency = new HashMap();
        
        for(char c: s.toCharArray()){
            
            frequency.put(c, frequency.getOrDefault(c,0) + 1);
            
        }
        
        PriorityQueue<Character> queue = new PriorityQueue<Character>((a,b)->frequency.get(b) - frequency.get(a));
        
        for(Map.Entry<Character, Integer> mp : frequency.entrySet()){
            queue.add(mp.getKey()); 
        }
                
        StringBuilder result = new StringBuilder();
        
        while(queue.size() > 1){
            
            char first = queue.poll();            
            char second = queue.poll();
            
            result.append(first);
            result.append(second);
            
            frequency.put(first, frequency.get(first)-1);
            frequency.put(second, frequency.get(second)-1);
            if(frequency.get(first) > 0){
                queue.add(first);
            }
            if(frequency.get(second) > 0){
                queue.add(second);
            }            
        }
        
        if(!queue.isEmpty()){
            char last = queue.poll();
            if(frequency.get(last) > 1){
                return "";
            }
            result.append(last);
        }
        
        
        return result.toString();
    }
}
