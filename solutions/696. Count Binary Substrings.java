class Solution {
    public int countBinarySubstrings(String s) {
        
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        
        for(int i = 1; i < groups.length; i++){
            if(s.charAt(i) != s.charAt(i-1)){
                groups[++t] = 1;
            }
            else{
                groups[t]++;
            }
        }
        
        int ans = 0;
        for(int i = 1; i <=t ; i++){
            ans += Math.min(groups[i], groups[i-1]);
        }
        
        return ans;
    }
}
