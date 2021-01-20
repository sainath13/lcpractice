class TrieNode{
    private TrieNode[] links;
    private boolean isEnd;
    public TrieNode(){
        links = new TrieNode[26]; 
    }
    public void setEnd(){
        isEnd = true;
    }
    public boolean isEnd(){
        return isEnd;
    }
    
    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }
    public TrieNode get(char ch){
        return links[ch - 'a'];
    }
    public void put(char ch, TrieNode node){
        links[ch - 'a'] = node;
    }
}
class Trie {
    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i=0; i < word.length();i++){
            char curr = word.charAt(i);
            if(!node.containsKey(curr)){
                node.put(curr,new TrieNode());
            }
            node = node.get(curr); //here you forgot to move the node. just writing node.get(curr) doesnt make any sense. not that hard to spot in reread 
        }
        node.setEnd();
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0 ; i < word.length() ; i++){
            char curr = word.charAt(i);
            if(!node.containsKey(curr)){
                return false;
            }
            node = node.get(curr);
        }
        return node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length();i++){
            char curr = prefix.charAt(i);
            if(node.containsKey(curr)){
                node = node.get(curr);
            }
            else{
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
