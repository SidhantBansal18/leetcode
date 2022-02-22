class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length();
        int result = 0;
        boolean[][] palindrome = new boolean[len][len];
        
        for(int d = 0; d < len; d++){
            
            for(int i = 0, j = d; j < len; i++, j++){
                
                if(d == 0){
                    palindrome[i][j] = true;
                    result++;
                }
                
                else if(d == 1){
                    
                    if(s.charAt(i) == s.charAt(j)){
                        palindrome[i][j] = true;
                        result++;
                    }
                    else{
                        palindrome[i][j] = false;
                    }
                    
                }
                
                else{
                    
                    if(s.charAt(i) == s.charAt(j) && palindrome[i+1][j-1] == true){
                        palindrome[i][j] = true;
                        result++;
                    }
                    else{
                        palindrome[i][j] = false;
                    }
                    
                }
            }
            
        }
        
        return result;
    }
}
