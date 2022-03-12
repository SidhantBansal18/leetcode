class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList();
        
        StringBuilder sb = new StringBuilder();
        
        backtrack(result, sb, n, 0, 0);
        
        return result;
        
    }
    
    public void backtrack(List<String> result, StringBuilder sb, int max, int open, int close){
        
        if(sb.length() == max * 2){
            result.add(sb.toString());
            return;
        }
        
        if(open < max){
            sb.append('(');
            backtrack(result, sb, max, open+1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(close < open){
            sb.append(')');
            backtrack(result,sb,max, open, close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
