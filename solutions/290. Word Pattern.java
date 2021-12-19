class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        
        Map<Character, String> map = new HashMap();
        if(pattern.length() != word.length)   return false;
        
        for(int i = 0; i < word.length; i++){
            char curr = pattern.charAt(i);
            if(map.containsKey(curr)){
                if (!map.get(curr).equals(word[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(curr, word[i]);
            }
        }
        
        return true;
    }
}
