class Solution {
    public List<String> letterCombinations(String digits) {
        
        HashMap<Character, String> mapping = new HashMap();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");
        
        List<String> result = new ArrayList();
        
        if(digits.length() == 0)  return result;
        
        StringBuilder combination = new StringBuilder();
        
        backtrack(result, digits, mapping, combination, 0);
        
        return result;
    }
    
    public void backtrack(List<String> result, String digits, HashMap<Character, String> mapping, StringBuilder combination, int offset){
        
        if(combination.length() == digits.length()){
            result.add(combination.toString());
            return;
        }
        
        String curr = mapping.get(digits.charAt(offset));
        
        for(int j = 0; j < curr.length(); j++){
            combination.append(curr.charAt(j));
            backtrack(result, digits, mapping, combination, offset+1);
            combination.deleteCharAt(combination.length()-1);
        }
        return;
    }
}
