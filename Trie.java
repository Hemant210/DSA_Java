// Corrected Example Trie
public class Trie {
    // Node class represents each character node in Trie
    static class Node {
        Node[] children; // Array to hold references of next characters (a-z)
        boolean eow;     // Flag to mark End Of Word

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }

    static Node root = new Node();

    // Insert a word into Trie
    public static void insert(String word) {
        Node curr = root;  // ✅ use a local pointer
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];  // move forward
        }
        curr.eow = true; // ✅ mark end after finishing
    }

    // Search a word in Trie
    public static boolean search(String word) {
        Node curr = root;  // ✅ start from root each time
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false; // path not found
            }

            curr = curr.children[idx]; // move forward
        }
        return true;  // ✅ must be end of word
    }

    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any" };

        for (String w : words) {
            insert(w);
        }

        System.out.println(search("their")); // true
        System.out.println(search("thier")); // false
        System.out.println(search("an"));    // false
        System.out.println(search("any"));   // true
    }
}
