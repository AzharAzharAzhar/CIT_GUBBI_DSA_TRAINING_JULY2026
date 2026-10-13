package Day8;

class trieNode{
    trieNode[] children;
    boolean eow;
    trieNode(){
        this.children = new trieNode[26];
        this.eow = false;
    }
}

class trieClass{
    trieNode root = new trieNode();

    public void insert(String word){
        trieNode node = root;
        for(char ch: word.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null){
                node.children[index] = new trieNode();
            }
            node = node.children[index];
        }
        node.eow = true;
    }
    public boolean search(String word){
        trieNode node = root;
        for(char ch: word.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }
        return node.eow;
    }

    public void autoSugession(String prefix){
        trieNode node = root;
        for(char ch: prefix.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null){
                return;
            }
            node = node.children[index];
        }
        dfs(node, prefix);
    }

    public void dfs(trieNode node, String prefix){
        if(node.eow == true){
            System.out.println(prefix);
        }
       // char ch;
        for(int i=0;i<26;i++){
            if(node.children[i] != null){
                char ch = (char)(i+'a');
                dfs( node.children[i], prefix+ch);
            }
        }
    }
}

public class D8_P2_Trie {
    public static void main(){
        String[] s= {"we", "well", "wellness", "cit", "gubbi","gunda", "sammy","somberi","swamy","swapna", "swara","sagar","solute","smart"};
        trieClass trie = new trieClass();
        for(String i: s){
            trie.insert(i);
        }

       //System.out.println(trie.search("gunda"));
        trie.autoSugession("s");
    }
}
