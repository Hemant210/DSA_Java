// public class Recursion {
//     public static void printNumber(int n){
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printNumber(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumber(n);
//     }
// }

// Factorial using recursion
// class FDS{

//     int fact(int n)
//     {
//         int result;
//         if(n == 1)
//             return 1;
//         result = (n - 1) * n;
//         return result;
        
//     }
// }
// public class Recursion {

//     public static void main(String[] args)
//     {
//         FDS f = new FDS();
//         System.out.println(f.fact(5));
//     }
// }

//Sum of N natural number
// public class Recursion {
//     public static void printNum(int i, int n, int sum){
//         if(i == n){
//           sum += i;
//           System.out.println(sum);
//           return;  
//         }
//         sum += i;
//         printNum(i+1, n, sum);
//         System.out.println(i);
//     }

//     public static void main(String[] args) {
//         printNum(1, 5, 0);
//     }
// }

//Practice factorial no
// public class Recursion{
//     public static int printcal(int n){
//         if(n == 1 || n == 0){
//             return 1;
//         }
//         int print_n = printcal(n-1);
//         int final_m = n * print_n;
//         return final_m;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = printcal(n);
//         System.out.println(ans);
//     }
// }

//Fibonnacci sequence
// public class Recursion {
//     public static void Fibonnacci(int a, int b, int n){
//         if(n == 0){
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         Fibonnacci(b, c, n - 1);
//     }

//     public static void main(String[] args) {
//         int a = 0, b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         Fibonnacci(a, b, n - 2);
//     }
// }

public class Recursion {
    public static int printx(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int x_power = printx(x, n-1);
        int x_pown = x * x_power;
        return x_pown;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(printx(x, n));
    }
}