//Example Trie
public class Trie {
    // Node class represents each character node in Trie
    static class Node {
        Node[] children; // Array to hold references of next characters (a-z)
        boolean eow;     // Flag to mark End Of Word (true if word ends here)

        public Node() {
            children = new Node[26]; 
            for (int i = 0; i < 26; i++) {
                children[i] = null; 
            }
            eow = false; // By default, not the end of any word
        }
    }

    static Node root = new Node();

    // Insert a word into Trie
    public static void insert(String word) {
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a'; // Find array index (0-25)

            // If node does not exist for this character, create it
            if (root.children[idx] == null) {
                root.children[idx] = new Node();
            }

            // If we are at the last character of the word, mark end of word
            if (i == word.length() - 1) {
                root.children[idx].eow = true;
            }

            // Move to the next node (⚠️ changes global root, should use curr)
            root = root.children[idx];
        }
    }

    //Search a word into Trie
    public static String search(String word){
        
    }
    
    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
    }
}
