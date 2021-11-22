class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList();
        if(p.length() > s.length()) return list;
        int[] core = new int[26];
        // for(int i = 0; i < p.length(); i++){
        //     char curr = p.charAt(i);
        //     core[curr - 'a']++;
        // }
        
        int[] dump = new int[26];
        int left = 0;
        int right = 0;
        
        // for(int i = left; i < right; i++){
        //     char curr = s.charAt(i);
        //     dump[curr - 'a']++;
        // }
        
        while(right < p.length()){
            core[p.charAt(right) - 'a']++;
            dump[s.charAt(right) - 'a']++;
            right++;
        }
        right--; 
        
        while(right < s.length()){    
            if(toCheck(core, dump)){
                list.add(left);
            }
            
