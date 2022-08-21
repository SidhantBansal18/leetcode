class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList();
        
        Map<String, List<String>> groups = new HashMap();
        
        for(int i = 0; i < strs.length; i++){
            
            String curr = strs[i];
            
            char[] arr = curr.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            List<String> list = new ArrayList();
            
            if(groups.containsKey(key)){
                list = groups.get(key);
            }
            list.add(curr);
            groups.put(key, list);
            
        }
        
        for(Map.Entry<String, List<String>> mq: groups.entrySet()){
            result.add(mq.getValue());
        }
        
        return result;
    }
}
