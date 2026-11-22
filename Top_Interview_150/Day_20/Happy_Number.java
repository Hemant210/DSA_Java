package Top_Interview_150.Day_20;

import java.util.HashSet;

public class Happy_Number {
    public static boolean ishappy(int n){
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if(set.contains(n)) return false;
            set.add(n);
            int happy = 0;
            while (n > 0) {
                int digit = n % 10;
                happy += digit * digit;  
                n /= 10;
            }

            n = happy;
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 2;

        System.out.println(ishappy(n));
    }
}
