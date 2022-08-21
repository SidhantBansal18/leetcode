class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> parens = new HashMap();
        
        parens.put(')', '(');
        parens.put('}', '{');
        parens.put(']', '[');
        
        Stack<Character> top = new Stack<>();
            
        for(int i = 0; i < s.length(); i++){
            
            char curr = s.charAt(i);
            
            if(curr == '(' || curr == '{' || curr == '['){
                top.push(curr);
            }
            else{
                char topElement;
                if(top.isEmpty()){
                    topElement = '#';
                }
                else{
                    topElement = top.pop();
                }
                
                if(parens.get(curr) != topElement){
                    return false;
                }
                
            }
            
        }
        
        return top.isEmpty();
    }
}
