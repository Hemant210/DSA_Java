public class Trie {
    // Node class represents each character node in Trie
    static class Node {
        Node[] children; // Array to hold references of next characters (a-z)
        boolean eow; // Flag to mark End Of Word

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }

    static Node root = new Node();

    // Insert a word into Trie
    public static void insert(String word) {
        Node curr = root; // ✅ use a local pointer
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx]; // move forward
        }
        curr.eow = true; // ✅ mark end after finishing
    }

    // Search a word in Trie
    // Time complexity - O(L)
    public static boolean search(String word) {
        Node curr = root; // ✅ start from root each time
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false; // path not found
            }

            curr = curr.children[idx]; // move forward
        }
        return curr.eow; // ✅ must be end of word
    }

    // Word break problem google
    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 0; i <= key.length(); i++) {
            String firstpart = key.substring(0, i);
            String secondpart = key.substring(i);

            if (search(firstpart) && wordbreak(secondpart)) {
                return true;
            }
        }

        return false;
    }

    // Starts with problem - prefix
    public static boolean startprefix(String prefix) {
        Node curr = root;
        for (int i = 0;  i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    //Count Unique Substring 
    public static int countNode(Node root){
        if (root == null) {
            return 0;
        }

        int count = 0;
        for(int i=0; i < 26; i++){
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }

        return count+1;
    }
    public static void main(String[] args) {
        //String[] words = { "i", "like", "sam", "samsung", "mobile" };
        // String key = "ilikesamsung";

        // String[] words = { "appple", "app", "mango", "man", "woman" };
        // String prefix = "app";

        String str = "apple";

        for(int i = 0; i < str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
          
        // for (String w : words) {
        //     insert(w);
        // }

        // System.out.println(startprefix(prefix));

        // System.out.println(wordbreak(key));

        // System.out.println(search("their")); // true
        // System.out.println(search("thier")); // false
        // System.out.println(search("an")); // false
        // System.out.println(search("any")); // true

        System.out.println(countNode(root));
    }
}
