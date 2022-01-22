class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() < 1 || s == null)    return "";
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            int len1 = palindrome(s, i,i);
            int len2 = palindrome(s,i,i+1);
            
            int result = Math.max(len1,len2);
            
            if(result > end-start){
                start = i - ((result-1)/2);
                end = i + (result/2);
            }
            
        }
        
        return s.substring(start,end+1);
        
    }
    
    public int palindrome(String s, int left, int right){
        
        if(s == null || left > right)    return 0;
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        return right-left-1;
    }
}
