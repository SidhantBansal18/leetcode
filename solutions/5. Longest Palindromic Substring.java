class Solution {
    public String longestPalindrome(String s) {
        
        boolean[][] isPalindrome = new boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;
        int result = Integer.MIN_VALUE;
        
        for(int i = 0; i < isPalindrome.length; i++){
            
            for(int j = 0, k = i; k < isPalindrome[0].length; j++, k++){
                
                if(j == k){
                    isPalindrome[j][k] = true;
                }
                
                else if(k-j == 1){
                    if(s.charAt(k) == s.charAt(j)){
                        isPalindrome[j][k] = true;
                        if((k-j) > result){
                            result = k-j;
                            start = j;
                            end = k;
                        }
                    }
                }
                
                else{
                    if(s.charAt(k) == s.charAt(j) && isPalindrome[j+1][k-1]){
                        isPalindrome[j][k] = true;
                        if((k-j) > result){
                            result = k-j;
                            start = j;
                            end = k;
                        }
                    }
                }
            }
            
        }
        
        return s.substring(start, end+1).toString();
        
    }
}
