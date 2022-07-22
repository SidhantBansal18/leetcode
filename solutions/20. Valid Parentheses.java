class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> parentheses = new HashMap();
        
        parentheses.put(')', '(');
        parentheses.put('}', '{');
        parentheses.put(']', '[');
        
        List<Character> openingParantheses = new ArrayList();
        openingParantheses.add('(');
        openingParantheses.add('[');
        openingParantheses.add('{');
        
        
        Stack<Character> visited = new Stack();
            
        for(int i = 0; i < s.length(); i++){
            
            Character currChar = s.charAt(i);
            
            if(openingParantheses.contains(currChar)){
                visited.push(currChar);
            }
            
            else{
                Character toBeCompared;
                if(visited.isEmpty()){
                    toBeCompared = '#';
                }
                else{
                    toBeCompared = visited.pop();
                }
                
                Character toCompareWith = parentheses.get(currChar);
                
                if(toBeCompared != toCompareWith){
                    return false;
                }
            }
            
