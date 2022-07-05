class Solution {
    
    class Trie{
        Trie sub[] = new Trie[26];
        LinkedList<String> suggestions = new LinkedList();
    }
    
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie root = new Trie();
        for(String prod: products){
            insert(prod, root);
        }
        
        return search(searchWord, root);
    }
    
    public void insert(String product, Trie root){
        Trie t = root;
        
        for(char c: product.toCharArray()){
            
            if(t.sub[c -  'a'] == null){
                t.sub[c - 'a'] = new Trie();
            }
            t = t.sub[c - 'a'];
            t.suggestions.offer(product);
            Collections.sort(t.suggestions);
            if(t.suggestions.size() > 3){
                t.suggestions.pollLast();
            }
        }
    }
    
    public List<List<String>> search(String searchWord, Trie root){
        List<List<String>> result = new ArrayList();
        for(char c: searchWord.toCharArray()){
            if(root != null){
                root = root.sub[c-'a'];
            }
            result.add(root == null? Arrays.asList() :root.suggestions);
        }
        
        return result; 
    }
}
​
