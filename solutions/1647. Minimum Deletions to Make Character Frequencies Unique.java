class Solution {
    public int minDeletions(String s) {
        
        int[] frequencies = new int[26];
        
        for(char character: s.toCharArray()){
            frequencies[character - 'a']++;
        }
        
        int minDeletions = 0;
        Set<Integer> occurences = new HashSet();
        
        for(int num : frequencies){
            
            if(num > 0){
                if(occurences.contains(num)){
                    while(occurences.contains(num) && num >= 0){
                        num--;
                        minDeletions++;
                    }
                }
                if(num != 0)    occurences.add(num);
            }
            
        }
        
        return minDeletions;
    }
}
