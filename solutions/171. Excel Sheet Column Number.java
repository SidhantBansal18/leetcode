class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = (columnTitle.charAt(0) - 'A')+1;
        
        for(int i = 1; i < columnTitle.length(); i++){
            result *= 26;
            result += (columnTitle.charAt(i) - 'A')+1;
        }
        
        return result;
    }
}
