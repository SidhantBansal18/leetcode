class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        
        Map<String, List<String>> map = new HashMap();
        
        for(int i = 0; i < strs.length; i++){
            char[] currWord = strs[i].toCharArray();
            Arrays.sort(currWord);
            String val = String.valueOf(currWord);
            if(map.containsKey(val)){
                map.get(val).add(strs[i]);
            }
            else{
                List<String> temp = new ArrayList();
                temp.add(strs[i]);
                map.put(val, temp);
            }
        }
        result = new ArrayList(map.values());
        return result;
    }
}
