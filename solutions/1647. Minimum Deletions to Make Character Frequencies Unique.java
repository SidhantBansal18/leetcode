class Solution {
    public int minDeletions(String s) {
        
        int[] frequencies = new int[26];
        
        for(char character: s.toCharArray()){
            frequencies[character - 'a']++;
        }
        
        int minDeletions = 0;
        Set<Integer> occurences = new HashSet();
        
        for(int num : frequencies){
            
            while(num > 0 && occurences.contains(num)){
                num--;
                minDeletions++;
            }
            occurences.add(num);
        }
        
        return minDeletions;
    }
}
