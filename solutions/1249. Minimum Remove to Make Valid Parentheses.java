class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> indexStack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
        
        for(int index = 0; index < sb.length(); index++){
            char curr = sb.charAt(index);
            
            if(curr == '('){
                indexStack.push(index);
            }
            else if(curr == ')'){
                if(!indexStack.isEmpty()){
                    indexStack.pop();
                }
                else{
                    sb.setCharAt(index, '*');
                }
            }
        }
        
        while(!indexStack.isEmpty()){
            int index = indexStack.pop();
            sb.setCharAt(index, '*');
        }
        
        return sb.toString().replaceAll("\\*", "");
    }
}
