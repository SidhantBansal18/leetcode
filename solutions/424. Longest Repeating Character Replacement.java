class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int left = 0;
        
        for(int right = 0; right < s.length(); right++){
            
            char curr = s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            
            int currMax = 0;
            for(Map.Entry<Character, Integer> m : map.entrySet()){
                currMax = Math.max(currMax, m.getValue());
            }
            
            if((right-left+1 - currMax) > k){
                int tempVal = map.get(s.charAt(left));
                tempVal--;
                map.put(s.charAt(left), tempVal);
                left++;
            }
            
            result = Math.max(result, right-left+1);
        }
        
        
        return result;
    }
}
