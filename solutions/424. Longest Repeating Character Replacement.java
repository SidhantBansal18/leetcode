class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freq = new int[26];
        int left = 0;
        int max = 0;
        int mostFrequent = 0;
        
        for(int right = 0; right < s.length(); right++){
            
            freq[s.charAt(right) - 'A']++;
            mostFrequent = Math.max(mostFrequent, freq[s.charAt(right)-'A']);
            
            int lettersToChange = (right-left+1)-mostFrequent;
            
            if(lettersToChange > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            max = Math.max(max, right-left+1);
        }
        
        return max;
    }
}
