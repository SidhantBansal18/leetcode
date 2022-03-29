class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] charFreq = new int[26];
        
        for(char c : tasks){
            charFreq[c-'A']++;
        }
        
        Arrays.sort(charFreq);
        
        int max_val = charFreq[charFreq.length-1] - 1;
        int idle_slots = max_val * n;
        
        for(int i = 24; i >= 0; i--){
            idle_slots -= Math.min(charFreq[i], max_val);
        }
        
        return idle_slots > 0 ? idle_slots+tasks.length: tasks.length; 
    }
}
