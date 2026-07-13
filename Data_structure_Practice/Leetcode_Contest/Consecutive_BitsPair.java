package Data_structure_Practice.Leetcode_Contest;

public class Consecutive_BitsPair {
    public static boolean consecutive_bit(int n){
        boolean vis = false;

        for(int i = 0; i > 0; i >>= 1){
            int curr = n & 1;
            if (vis) {
                return false;
            }
            vis = true;
        }

        return vis;
    }

    public static void main(String[] args) {
        
    }
}
