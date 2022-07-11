class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int tempLength = 0;
        Map<Character, Integer> occurrences = new HashMap();
        int left = 0;
        int right = 0;
        for(right = 0; right < s.length(); right++){
            if(occurrences.containsKey(s.charAt(right))){
                tempLength = Math.max(maxLength, tempLength);
                int value = occurrences.get(s.charAt(right)) + 1;
                while(left < value && left < right){
                    maxLength -= 1;
                    occurrences.remove(s.charAt(left));
                    left++;
                }
            }
            maxLength += 1;
            occurrences.put(s.charAt(right), right);
        }
        
        return Math.max(tempLength, maxLength);
    }
}
