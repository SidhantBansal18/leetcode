class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> openingParan = new Stack<>();
        int closingParan = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            char curr = s.charAt(i);
            
            if(curr == '('){
                openingParan.push(curr);
            }
            
            else if(curr == ')'){
                if(!openingParan.isEmpty() && openingParan.peek() == '('){
                    openingParan.pop();
                }
                else{
                    closingParan++;
                }
            }
        }
        
        return openingParan.size() + closingParan; 
    }
}
