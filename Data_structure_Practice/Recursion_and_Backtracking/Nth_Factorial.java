package Data_structure_Practice.Recursion_and_Backtracking;

public class Nth_Factorial {
    public static int n_fact(int n){
        if (n == 0) {
            return 1;
        }

        return n * n_fact(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Factorial Number :- " + n_fact(n));
    }
}
