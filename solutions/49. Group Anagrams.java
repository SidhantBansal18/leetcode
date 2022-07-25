class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap();
        
        for(String s : strs){
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            String key = String.valueOf(arr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            
            List<String> value = map.get(key);
            value.add(s);
            
            map.put(key, value);
            
        }
        
        List<List<String>> result = new ArrayList();
        
        for(Map.Entry<String, List<String>> currValue: map.entrySet()){
            result.add(currValue.getValue());
        }
        
        return result; 
    }
}
