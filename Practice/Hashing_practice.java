package Practice;

import java.util.*;

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
// public class Hashing_practice {

//     static int findMinDiff(int[] arr, int m) {
//         int n = arr.length;

//         Arrays.sort(arr);

//         int minDiff = Integer.MAX_VALUE;

//         for (int i = 0; i + m - 1 < n; i++) {

//             // calculate difference of current window
//             int diff = arr[i + m - 1] - arr[i];

//             // if current difference is smaller
//             // then update the minimum difference
//             if (diff < minDiff)
//                 minDiff = diff;
//         }
//         return minDiff;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
//         int m = 3;

//         System.out.println(findMinDiff(arr, m));
//     }
// }

//Majority Element II - Hashmap 
//Time complexity :- O(n)
// public class Hashing_practice {
//     public static void majorityelement(int nums[]){
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = nums.length;

//         for(int i=0; i<n; i++){
//             if (map.containsKey(nums[i])) {
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             } else {
//                 map.put(nums[i], 1);
//             }
//         }

//         for(int key : map.keySet()){
//             if(map.get(key) > n/3) {
//                 System.out.println(key);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,3,2,5,1,3,1,5,1};
//         majorityelement(nums);
//     }
// }

//Majority Element - Hashmap 
//Time complexity :- O(n)
// public class Hashing_practice {
//     public static void majorityelement(int nums[]) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }

//         for (int key : map.keySet()) {
//             if (map.get(key) > n / 2) {
//                 System.out.println(key);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int nums[] = {2,2,1,1,1,2,2};
//         majorityelement(nums);
//     }
// }

//Union of 2 arrays print size
// public class Hashing_practice {
//     public static int union(int arr1[],int arr2[]){
//         HashSet <Integer> set = new HashSet<>();

//         for(int i=0; i < arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         for(int j=0; j < arr2.length; j++){
//             set.add(arr2[j]);
//         }

//         return set.size();
//     }
//     public static void main(String[] args) {
//         int arr1[] = {7,3,9};
//         int arr2[] = {6,3,9,2,9,4};

//         System.out.println(union(arr1, arr2));

//     }
// }

//Union of 2 arrays print array
// public class Hashing_practice {
//     public static void union(int arr1[],int arr2[]){
//         HashSet <Integer> set = new HashSet<>();

//         for(int i=0; i < arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         for(int j=0; j < arr2.length; j++){
//             set.add(arr2[j]);
//         }

//         System.out.println(set);
//     }
//     public static void main(String[] args) {
//         int arr1[] = {7,3,9};
//         int arr2[] = {6,3,9,2,9,4};

//         union(arr1, arr2);
//     }
// }

//Instersection of 2 arrays print size
// public class Hashing_practice {
//     public static int instersection(int arr1[], int arr2[]){
//         HashSet <Integer> set = new HashSet<>();
//         int count = 0;

//         for(int i=0; i < arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         for(int j=0; j < arr2.length; j++){
//             if (set.contains(arr2[j])) {
//                 count++;
//                 set.remove(arr2[j]);
//             }
//         }

//         return count;
//     }
//     public static void main(String[] args) {
//         int arr1[] = {7,3,9};
//         int arr2[] = {6,3,9,2,9,4};

//         System.out.println(instersection(arr1, arr2));
//     }
// }

//Instersection of 2 arrays print array
// public class Hashing_practice {
//     public static void instersection(int arr1[], int arr2[]){
//         HashSet <Integer> set = new HashSet<>();
//         HashSet <Integer> intersectionSet = new HashSet<>();

//         for(int i=0; i < arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         for(int j=0; j < arr2.length; j++){
//             if (set.contains(arr2[j])) {
//                 intersectionSet.add(arr2[j]);
//                 set.remove(arr2[j]);
//             }
//         }

//         System.out.println(intersectionSet);
//     }
//     public static void main(String[] args) {
//         int arr1[] = {7,3,9};
//         int arr2[] = {6,3,9,2,9,4};

//         instersection(arr1, arr2);
//     }
// }

// Find Itinerary from tickets
// public class Hashing_practice {
//     public static String getStart(HashMap<String, String> tik){
//         HashMap<String, String> revMap = new HashMap<>();

//         for(String key : tik.keySet()){
//             //key -> value
//             revMap.put(tik.get(key), key);
//         }

//         for(String key : tik.keySet()){
//             if (!revMap.containsKey(key)) {
//                 return key;
//             }
//         }

//         return null;
//     }
//     public static void main(String[] args) {       
//         HashMap<String, String> tickets = new HashMap<>();
//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getStart(tickets);

//         while (tickets.containsKey(start)) {
//             System.out.println(start + "->");
//             start = tickets.get(start);
//         }

//         System.out.println(start);
//     }
// }

//Subarray sum equal to K
// public class Hashing_practice {
//     public static void main(String[] args) {
//         int arr[] = {10, 2, -2, -20, 10}; 
//         int k = -10; 

//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Initialize map with 0 sum occurring once
//         map.put(0, 1);

//         int ans = 0; // to count number of subarrays with sum = k
//         int sum = 0; // cumulative prefix sum

//         // Traverse the array
//         for (int j = 0; j < arr.length; j++) {
//             sum += arr[j]; // update prefix sum

//             // If (sum - k) is found in map, it means subarray with sum k exists
//             if (map.containsKey(sum - k)) {
//                 ans += map.get(sum - k); // add frequency of (sum - k)
//             }

//             // Update frequency of current sum in map
//             if (map.containsKey(sum)) {
//                 map.put(sum, map.get(sum) + 1);
//             } else {
//                 map.put(sum, 1);
//             }
//         }

//         System.out.println(ans);
//     }
// }

//Top K Frequent Elements
// public class Hashing_practice {

//     //Function to return top K frequent elements
//     public static List<Integer> topKFrequent(int[] nums, int k) {
//         // Step 1: Count frequency of each number
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int n : nums) {
//             map.put(n, map.getOrDefault(n, 0) + 1);
//         }

//         // Step 2: Use a max-heap (priority queue) based on frequency
//         PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

//         pq.addAll(map.entrySet());

//         // Step 3: Take out top k elements
//         List<Integer> res = new ArrayList<>();
//         for (int i = 0; i < k; i++) {
//             res.add(pq.poll().getKey());
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 1, 2, 2, 3 };
//         int k = 2;

//         List<Integer> result = topKFrequent(arr, k);
//         System.out.println("Top " + k + " frequent elements: " + result);

//     }
// }

//Find k largest elements in an array
public class Hashing_practice {
    static ArrayList<Integer> kLargest(int[] arr, int k) {
        int n = arr.length;

        // Convert int type to Integer
        // for sorting with a comparator
        Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort the array in descending order
        Arrays.sort(arrInteger, Collections.reverseOrder());

        // Store the first k elements in result list
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++)
            res.add(arrInteger[i]);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;

        ArrayList<Integer> res = kLargest(arr, k);
        for (int ele : res)
            System.out.print(ele + " ");
    }
}