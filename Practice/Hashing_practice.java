package Practice;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.LinkedList;

// public class Hashing_practice {

//     // Custom HashMap implementation
//     public static class HashMap<K, V> {

//         // Node class to store key-value pairs
//         private class Node {
//             K key;
//             V value;

//             Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; // number of key-value pairs
//         private int N; // number of buckets
//         private LinkedList<Node>[] buckets; // array of linked lists

//         // Constructor
//         public HashMap() {
//             this.N = 4;
//             this.buckets = new LinkedList[N];
//             for (int i = 0; i < N; i++) {
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         // Hash function to get bucket index
//         private int hashFunction(K key) {
//             int hashCode = key.hashCode();
//             return Math.abs(hashCode) % N;
//         }

//         // Search for key in a bucket
//         private int searchInLL(K key, int bi) {
//             LinkedList<Node> ll = buckets[bi];
//             for (int i = 0; i < ll.size(); i++) {
//                 if (ll.get(i).key.equals(key)) {
//                     return i; // key found
//                 }
//             }
//             return -1; // key not found
//         }

//         // Rehash function to double the bucket size
//         private void rehash() {
//             LinkedList<Node>[] oldBuckets = buckets;
//             N = N * 2;
//             buckets = new LinkedList[N];
//             for (int i = 0; i < N; i++) {
//                 buckets[i] = new LinkedList<>();
//             }
//             n = 0;

//             for (LinkedList<Node> ll : oldBuckets) {
//                 for (Node node : ll) {
//                     put(node.key, node.value);
//                 }
//             }
//         }

//         // Put key-value in map
//         public void put(K key, V value) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);

//             if (di == -1) {
//                 buckets[bi].add(new Node(key, value));
//                 n++;
//             } else {
//                 Node node = buckets[bi].get(di);
//                 node.value = value; // update value
//             }

//             double lambda = (double) n / N;
//             if (lambda > 2.0) {
//                 rehash();
//             }
//         }

//         // Get value for a key
//         public V get(K key) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);

//             if (di == -1) {
//                 return null;
//             } else {
//                 return buckets[bi].get(di).value;
//             }
//         }

//         // Check if key exists
//         public boolean containsKey(K key) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);
//             return di != -1;
//         }

//         // Remove a key
//         public V remove(K key) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);

//             if (di == -1) {
//                 return null;
//             } else {
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             }
//         }

//         // Return all keys
//         public ArrayList<K> keySet() {
//             ArrayList<K> keys = new ArrayList<>();
//             for (LinkedList<Node> ll : buckets) {
//                 for (Node node : ll) {
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }

//         // Check if empty
//         public boolean isEmpty() {
//             return n == 0;
//         }

//         // Get size
//         public int size() {
//             return n;
//         }
//     }

//     // Main function to test all operations
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();

//         // PUT operation
//         System.out.println("=== PUT Operations ===");
//         map.put("India", 100);
//         map.put("China", 120);
//         map.put("US", 90);
//         System.out.println("After adding India, China, US:");
//         printMap(map);

//         // GET operation
//         System.out.println("\n=== GET Operations ===");
//         System.out.println("Population of India: " + map.get("India"));
//         System.out.println("Population of Japan (not present): " + map.get("Japan"));

//         // CONTAINS KEY operation
//         System.out.println("\n=== CONTAINS KEY ===");
//         System.out.println("Contains India? " + map.containsKey("India"));
//         System.out.println("Contains Japan? " + map.containsKey("Japan"));

//         // REMOVE operation
//         System.out.println("\n=== REMOVE Operation ===");
//         System.out.println("Removed India: " + map.remove("India"));
//         System.out.println("After removal:");
//         printMap(map);

//         // ISEMPTY & SIZE
//         System.out.println("\n=== SIZE & EMPTY Check ===");
//         System.out.println("Current size: " + map.size());
//         System.out.println("Is map empty? " + map.isEmpty());

//         // Adding more data to check rehash
//         System.out.println("\n=== Adding More Data (rehash may happen) ===");
//         map.put("Brazil", 80);
//         map.put("UK", 70);
//         map.put("Canada", 60);
//         map.put("Australia", 50);
//         System.out.println("After adding more countries:");
//         printMap(map);
//         System.out.println("Current size: " + map.size());
//     }

//     // Helper method to print entire map
//     public static void printMap(HashMap<String, Integer> map) {
//         ArrayList<String> keys = map.keySet();
//         for (String key : keys) {
//             System.out.println(key + " -> " + map.get(key));
//         }
//     }
// }

//Choose k array elements such that difference of maximum and minimum is minimized
public class Hashing_practice {

    static int findMinDiff(int[] arr, int m) {
        int n = arr.length;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for(int i=0;i + m -1 < n; i++){
        // calculate difference of current window
        int diff = arr[i + m -1] - arr[i];
        }
            // if current difference is smaller
            // then update the minimum difference
            if (diff < minDiff) {
                minDiff = diff;
            }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        System.out.println(findMinDiff(arr, m));
    }
}