public class Trie {     

    // Node class represents each character node in Trie
    static class Node {         
        Node[] children; // Array of child nodes for each character (a-z)
        boolean eow;     // Flag -> true if this node represents End Of Word

        public Node() {  
            children = new Node[26]; // only lowercase letters (a-z)
            eow = false;             // initially, no word ends here
        }
    }     

    static Node root = new Node();  // Root node of Trie (empty by default)

    // Insert a word into Trie
    public static void insert(String word) {         
        Node curr = root;  // start from root every time
        for (int i = 0; i < word.length(); i++) {  
            int idx = word.charAt(i) - 'a'; // convert char -> index (0–25)

            // If the path doesn't exist, create a new node
            if (curr.children[idx] == null) {                 
                curr.children[idx] = new Node();             
            }

            curr = curr.children[idx]; // move pointer forward
        }
        curr.eow = true; // mark last character as End Of Word
    }

    // Search a word in Trie
    // Time complexity - O(L), where L = length of word
    public static boolean search(String word) {         
        Node curr = root; // start from root         
        for (int i = 0; i < word.length(); i++) {             
            int idx = word.charAt(i) - 'a';              

            if (curr.children[idx] == null) {                 
                return false; // path does not exist -> word not found            
            }
            curr = curr.children[idx]; // move forward
        }
        return curr.eow; // must end at a word, not just a prefix
    }

    // Word Break Problem (Google Interview Question)
    // Check if a string can be split into valid dictionary words
    public static boolean wordbreak(String key) {         
        if (key.length() == 0) { // empty string -> valid
            return true;         
        }

        // try every possible split
        for (int i = 0; i <= key.length(); i++) {             
            String firstpart = key.substring(0, i);   // prefix
            String secondpart = key.substring(i);     // remaining string

            // if prefix is a word and rest can also be split -> success
            if (search(firstpart) && wordbreak(secondpart)) {                 
                return true;             
            }         
        }
        return false; // no valid split found
    }

    // Starts With Problem
    // Check if any word in Trie starts with a given prefix
    public static boolean startprefix(String prefix) {         
        Node curr = root;         
        for (int i = 0;  i < prefix.length(); i++) {             
            int idx = prefix.charAt(i) - 'a';              

            if (curr.children[idx] == null) {                 
                return false; // prefix path not found             
            }
            curr = curr.children[idx];         
        }
        return true; // full prefix exists
    }

    // Count unique substrings problem
    // Idea: Every unique substring of a string corresponds to a unique path in Trie
    public static int countNode(Node root){         
        if (root == null) {             
            return 0;         
        }

        int count = 0;         
        for(int i=0; i < 26; i++){             
            if (root.children[i] != null) {                 
                count += countNode(root.children[i]); // count child nodes
            }         
        }
        return count+1; // include current node itself
    }

    // Longest Word with all prefixes
    // Example: if "a", "ap", "app", "appl", "apple" exist -> answer = "apple"
    public static String ans = "";      

    public static void Longestword(Node root, StringBuilder temp){         
        if (root == null) {             
            return;         
        }

        // check all possible children
        for(int i = 0; i < 26; i++){             
            // we only continue if child exists AND marks End Of Word
            if (root.children[i] != null && root.children[i].eow == true) {                 
                temp.append((char)(i + 'a'));  // add current char to temp

                // update longest answer if current is longer
                if (temp.length() > ans.length()) {                     
                    ans = temp.toString();                 
                }

                // recursively go deeper
                Longestword(root.children[i], temp);

                // backtrack (remove last char before exploring next branch)
                temp.deleteCharAt(temp.length()-1);             
            }         
        }
    }

    public static void main(String[] args) {         
        // Example dictionary of words
        String[] words = {"a" , "banana", "appl", "app", "ap", "apply", "apple"};          

        // Insert all words into Trie
        for (String w : words) {             
            insert(w);         
        }

        // Find the longest word with all prefixes
        Longestword(root, new StringBuilder(""));         
        System.out.println(ans);  

        // System.out.println(startprefix("app"));   // true
        // System.out.println(wordbreak("ilikesamsung")); // true/false
        // System.out.println(search("apple"));     // true
        // System.out.println(search("applf"));     // false
        // System.out.println(countNode(root));     // number of nodes
    } 
}
    