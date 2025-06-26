package Leetcode;

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

//Moce all X at end of String
//Time complexity  = O(n)
public class Recursion_practice {
    public static void x_move(int idx, String str, int count, String newString){
        if(idx == str.length()) {
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char current_char = str.charAt(idx);
        if(current_char == 'x'){
            count++;
            x_move(idx + 1, str, count, newString);
        }else{
            newString = newString + current_char;
            x_move(idx+1, str, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxxd";
        x_move(0, str, 0, "");
    }
}