class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet();
        int len = 0;
        
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(set.contains(curr)){
                len += 2;
                set.remove(curr);
            }
            else{
                set.add(curr);
            }
        }
        if(set.isEmpty())   return len;
        return len+1;
    }
}
