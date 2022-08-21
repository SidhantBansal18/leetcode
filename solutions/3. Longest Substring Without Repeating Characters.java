class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) return 0;
        
        int left = 0;        
        int right = 0;
        int currLen = 0;
        
        int maxLength = 1;
        
        Map<Character, Integer> occurences = new HashMap();
        
        for(right = 0; right < s.length(); right++){
            
            char curr = s.charAt(right);
            currLen++;
            
            if(occurences.containsKey(curr)){
                int value = occurences.get(curr)+1;
                while(left < right && left < value){
                    currLen--;
                    left++;
                }
            }
            
            maxLength = Math.max(currLen, maxLength);            
            occurences.put(curr, right);
            
        }
        
        return maxLength;
    }
}
