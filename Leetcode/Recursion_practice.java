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
public class Recursion_practice {
    public static void print_rev(String s, int idx){
        if(idx == 0){
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        print_rev(s, idx-1);
    }

     public static void main(String[] args) {
        String s = "abcd";
        print_rev(s, s.length()-1);
     }
}