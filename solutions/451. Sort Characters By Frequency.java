class Solution {
    public String frequencySort(String s) {
        
        //Frequency Map part
        HashMap<Character, Integer> frequencyMap = new HashMap();
        
        for(char c: s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }
        
        //Priorty Queue where we store characters according to the frequency in descending order
        PriorityQueue<Character> topFrequentQueue = new PriorityQueue((a,b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        for(Map.Entry<Character, Integer> hm : frequencyMap.entrySet()){
            topFrequentQueue.add(hm.getKey());
        }
        
        //Appending characters to the result as per their frequency
        StringBuilder result = new StringBuilder();
        
        while(!topFrequentQueue.isEmpty()){
            char current = topFrequentQueue.poll();
            int tempFrequency = frequencyMap.get(current);
            while(tempFrequency != 0){
                result.append(current);
                tempFrequency--;
            }
        }
        
        return result.toString();
        
    }
}
