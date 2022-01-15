class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String words = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        
        String[] word = words.split("\\s+");
        
        Set<String> set = new HashSet();
        
        for(String s : banned){
            set.add(s);
        }
        
        Map<String, Integer> map = new HashMap();
        
        for(String w : word){
            map.put(w, map.getOrDefault(w,0) + 1);
        }
        
        String result = "";
        int max = 0;
        
        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(!set.contains(m.getKey()) && m.getValue() > max){
                max = m.getValue();
                result = m.getKey();
            }
        }
        
        return result;
        
    }
}
