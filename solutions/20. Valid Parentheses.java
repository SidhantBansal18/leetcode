class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack();
        
        Map<Character, Character> map = new HashMap();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            
            if(curr == '(' || curr == '{' || curr == '['){
                stack.push(curr);
            }
            else{
                char topElement;
                if(stack.isEmpty()){
                    topElement = '#';
                }
                else    topElement = stack.pop();
                
                if(map.get(curr) != topElement){
                    return false;
                }
                
            }
            
        }
        
        return stack.isEmpty();
    }
}
