package Leetcode;

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
public class Recursion_practice {
    public static void print_permutations(String str, String newString){
        if(str.length() == 0){
            System.out.println(newString);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char current_char = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            print_permutations(newStr, newString + current_char);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        print_permutations(str, "");
    }
}