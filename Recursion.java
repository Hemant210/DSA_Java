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

//Sum of number
public class Recursion {
    public static void printNum(int i, int n, int sum){
        if(i == n){
          sum += i;
          System.out.println(sum);
          return;  
        }
        sum += i;
        printNum(i+1, n, sum);

    }

    public static void main(String[] args) {
        printNum(1, 5, 0);
    }
}