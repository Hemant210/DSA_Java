package Practice;

import java.util.ArrayList;
// import java.util.*;
// import java.util.HashSet;

//Tower of Hanoi
//Time complexity
// public class Recursion_practice {
//     public static void print_hanoi(int n,String src,String help,String dest){
//         if(n == 1){
//             System.out.println("Trsnsfer disk :- " + n + " from " + src + " to " + dest);
//             return;
//         }
//         print_hanoi(n-1, src, dest, help);
//         System.out.println("Trsnsfer disk :- " + n + " from " + src + " to " + dest );
//         print_hanoi(n-1, help, src, dest);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         print_hanoi(n, "S", "H", "D");
//     }
// }

//Reverse string
//Time complexity  = O(n)
// public class Recursion_practice {
//     public static void print_rev(String s, int idx){
//         if(idx == 0){
//             System.out.println(s.charAt(idx));
//             return;
//         }
//         System.out.print(s.charAt(idx));
//         print_rev(s, idx-1);
//     }

//      public static void main(String[] args) {
//         String s = "abcd";
//         print_rev(s, s.length()-1);
//      }
// }

//1st & last occurance of an element in string
// public class Recursion_practice {
//     public static void print_occ(int idx, String str){
//         if(idx == str.length()){
//             return;
//         }

//         if(str.charAt(idx) == 'a'){
//             System.out.println("'a' found at index: " + idx);
//         }

//         print_occ(idx + 1, str);
//     }
//     public static void main(String[] args) {
//         String str = "abaacdefaahb";
//         print_occ(0, str);
//     }
// }

//Check array is sorted
//Time complexity  = O(n)
// public class Recursion_practice {
//     public static boolean check_sort(int idx, int arr[]){
//         if(idx == arr.length - 1){
//             return true;
//         }
//         if(arr[idx] >= arr[idx + 1]){
//             return false;
//         }else{
//             return check_sort(idx + 1, arr);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,3,2,6};
//         System.out.println(check_sort(0, arr));

//     }
// }

//Move all X at end of String
//Time complexity  = O(n)
// public class Recursion_practice {
//     public static void x_move(int idx, String str, int count, String newString){
//         if(idx == str.length()) {
//             for(int i = 0; i < count; i++){
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char current_char = str.charAt(idx);
//         if(current_char == 'x'){
//             count++;
//             x_move(idx + 1, str, count, newString);
//         }else{
//             newString = newString + current_char;
//             x_move(idx+1, str, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbxxd";
//         x_move(0, str, 0, "");
//     }
// }

//Remove all duplicates
// public class Recursion_practice {
//     public static boolean[] map = new boolean[26];

//     public static void remove_duplicate(String str, int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }

//         char current_char = str.charAt(idx);
//         if(map[current_char - 'a'] == true){
//             remove_duplicate(str, idx+1, newString);
//         }else{
//             newString += current_char;
//             map[current_char - 'a'] = true;
//             remove_duplicate(str, idx+1, newString);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "axbxxd";
//         remove_duplicate(str, 0, "");

//     }
// }

//Important for interview
//Print all the subsequences of String
//Time Complexity: O(2n)
// public class Recursion_practice {
//     public static void subsequences(String str, int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char current_char = str.charAt(idx);
//         //To be
//         subsequences(str, idx + 1, newString + current_char);

//         //Not to be
//         subsequences(str, idx + 1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequences(str, 0, "");
//     }
// }

//Print all the unique subsequences of String
//Time Complexity: O(2n)
// import java.util.HashSet;

// public class Recursion_practice {
//     public static void subsequences(String str, int idx, String newString, HashSet<String> set){
//         if(idx == str.length()){
//             if(set.contains(newString)){
//                 return;
//             }
//             System.out.println(newString);
//             set.add(newString);
//             return;
//         }
//         char current_char = str.charAt(idx);
//         //To be
//         subsequences(str, idx + 1, newString + current_char, set);

//         //Not to be
//         subsequences(str, idx + 1, newString, set);
//     }
//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         subsequences(str, 0, str, set);
//     }
// }

//Print Keypad Combilnation
// public class Recursion_practice {
//     public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu" ,"vwz", "yz"};

//     public static void print_comb(String str, int idx, String Combilnation){
//         if(idx == str.length()){
//             System.out.println(Combilnation);
//             return;
//         }
//         char current_char = str.charAt(idx);
//         String mapping = keypad[current_char - '0'];

//         for(int i=0; i<mapping.length(); i++){
//             print_comb(str, idx+1, Combilnation+mapping.charAt(i));
//         }
//     }

//     public static void main(String[] args) {
//         String str = "23";
//         print_comb(str, 0, "");
//     }
// }

//Print al permutations of the String
//Time Complexity: O(n!)
// public class Recursion_practice {
//     public static void print_permutations(String str, String newString){
//         if(str.length() == 0){
//             System.out.println(newString);
//             return;
//         }
//         for(int i=0; i<str.length(); i++){
//             char current_char = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             print_permutations(newStr, newString + current_char);

//         }
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         print_permutations(str, "");
//     }
// }

//Total paths in a maze to move from (0,0) to (n,m)
//Time Complexity: O(n!)
// public class Recursion_practice {
//     public static int print_maze(int i,int j, int n, int m){
//         if(i == n || j == m){
//             return 0;
//         }
//         if(i == n-1 && j == m-1){
//             return 1;
//         }
//         //move downwards
//         int downPaths = print_maze(i+1, j, n, m);

//         //move right
//         int rightPaths = print_maze(i, j+1, n, m);
//         return downPaths + rightPaths;
//     }

//     public static void main(String[] args) {
//         int n = 3, m = 3;
//          int totalPaths = print_maze(0, 0, n, m);
//          System.out.println(totalPaths);

//     }
// }

//Tiles size 1xm in floor of size nxm n=4, m = 2
// public class Recursion_practice {
//     public static int place_tiles(int n, int m){
//         if(n == m){
//             return 2;
//         }

//         if(n < m){
//             return 1;
//         }

//         //vetical
//         int vertical_place = place_tiles(n-m, m);

//         //Horizontally
//         int Horizontally_place = place_tiles(n-1, m);
//         return vertical_place + Horizontally_place;
//     }

//     public static void main(String[] args) {
//         int n = 4, m = 2;
//         System.out.println(place_tiles(n, m));
//     }
// }

//Sum of natural number
// public class Recursion_practice {
//     public static String reverse_print(String str){
//         if(str.isEmpty())
//         return str;
//         else{
//             char current_char = str.charAt(0);
//             return reverse_print(str.substring(1)) + current_char;
//         }
//     }

//     public static void main(String[] args) {
//         String str = "Geeksforgeeks";
//         System.out.println(reverse_print(str));
//     }
// }

//single or in pairs invite people to party
// public class Recursion_practice {
//     public static int call_guest(int n){
//         if (n <= 1) {
//             return 1;
//         }

//         //Single
//         int way1 = call_guest(n-1);

//         //pairzs
//         int way2 = (n-1) * call_guest(n-2);

//         return way1 + way2;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println("Total way to invite guest :- " + call_guest(n));
//     }
// }

//Print all subset of set of first natural number
//Time Complexity: O(2^n)
// public class Recursion_practice {
//     public static void printsubset(ArrayList<Integer> subset){
//         for(int i = 0; i<subset.size(); i++){
//             System.out.print(subset.get(i)+ " ");
//         }
//         System.out.println();
//     }
//     public static void subset_n(int n, ArrayList<Integer> subset){
//         if(n == 0){
//             printsubset(subset);
//             return;
//         }

//         //all
//         subset.add(n);
//         subset_n(n-1, subset);

//         //
//         subset.remove(subset.size()-1);
//         subset_n(n-1, subset);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         ArrayList<Integer> subset = new ArrayList<>();
//         subset_n(n, subset);
//     }
// }

//Print all number of subset natural number
public class Recursion_practice {
    public static void printsub(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();

    }

    public static int subset_n(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            // printsubset(subset); // Optional
            return 1; // One valid subset
        }

        // Include current number
        subset.add(n);
        int count1 = subset_n(n - 1, subset);

        // Exclude current number
        subset.remove(subset.size() - 1);
        int count2 = subset_n(n - 1, subset);

        return count1 + count2;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> subset = new ArrayList<>();
        int total_sub = subset_n(n, subset);
        System.out.println("Total number of Subset :- " + total_sub);
    }
}