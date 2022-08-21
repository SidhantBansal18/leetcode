class Solution {
    public int characterReplacement(String s, int k) {
        
        char[] frequency = new char[26];
        int left = 0;
        int maxLength = 0;
        int mostFrequent = 0;
        
        for(int right = 0; right < s.length(); right++){
            
            char curr = s.charAt(right);
            
            frequency[curr - 'A']++;
            mostFrequent = Math.max(mostFrequent, frequency[curr - 'A']);
            
            int toChange = (right-left+1)-mostFrequent;
            
            if(toChange > k){
                frequency[s.charAt(left) - 'A']--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right-left+1);
            
        }
        
        return maxLength;
        
    }
}
