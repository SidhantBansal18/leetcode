class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false; 
        }
        
        int[] isAnagram = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            
            isAnagram[s.charAt(i) - 'a']++;
            isAnagram[t.charAt(i) - 'a']--;
            
        }
        
        for(int num: isAnagram){
            if(num != 0){
                return false;
            }
        }
        
        return true;
    }
}
