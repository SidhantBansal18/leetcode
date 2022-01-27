class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList();
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(int i = 0; i < strs.length; i++){
            
            char[] curr = strs[i].toCharArray();
            Arrays.sort(curr);
            String toCheck = String.valueOf(curr);
            
            if(!map.containsKey(toCheck)){
                List<String> list = new ArrayList();
                list.add(strs[i]);
                map.put(toCheck, list);
            }
            else{
                List<String> list = map.get(toCheck);
                list.add(strs[i]);
                map.put(toCheck, list);
            }
        }
        
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            result.add(m.getValue());
        }
        
        return result;
    }
}
