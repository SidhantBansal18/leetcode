class Solution {
    public String[] findWords(String[] words) {
        
        int[] alphabets = new int[26];
        
        int rowCount = 3;
        int rowVariable = 1;
        String[] rows = new String[rowCount];
        rows[0] = "qwertyuiop";
        rows[1] = "asdfghjkl";
        rows[2] = "zxcvbnm";
        
        
        for(String row: rows){
            
            for(int i = 0; i < row.length(); i++){
                char curr = row.charAt(i);
                alphabets[curr - 'a'] = rowVariable;
            }
            rowVariable++;
        }
        
        List<String> possibleWords = new ArrayList();
        
        for(String word : words){
            
            char first = word.charAt(0);
            boolean canBeTyped = true;
            int firstCount = alphabets[Character.toLowerCase(first) - 'a'];
            for(int i = 1; i < word.length(); i++){
                if(alphabets[Character.toLowerCase(word.charAt(i)) - 'a'] != firstCount){
                    canBeTyped = false;
                    break; 
                }
            }
            if(canBeTyped){
                possibleWords.add(word);
            }
        }
        
        String[] finalTypedWords = new String[possibleWords.size()];
        
        for(int i = 0; i < finalTypedWords.length; i++){
            finalTypedWords[i] = possibleWords.get(i);
        }
        
        return finalTypedWords;
    }
}
