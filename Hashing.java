import java.util.HashSet;

public class Hashing {

    public static void main(String[] args) {
        //Creating Hashset
        HashSet<Integer> set = new HashSet<>();

        //Insert Element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        //Search-contains element
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does Not contains");
        }
    }
}
