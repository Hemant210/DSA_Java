package Leetcode;

//Tower of Hanoi
public class Recursion_practice {
    public static void print_hanoi(int n,String src,String help,String dest){
        if(n == 1){
            System.out.println("Trsnsfer disk :- " + n + " from " + src + " to " + dest);
            return;
        }
        print_hanoi(n-1, src, dest, help);
        System.out.println("Trsnsfer disk :- " + n + " from " + src + " to " + dest );
        print_hanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        print_hanoi(n, "S", "H", "D");
    }
}
