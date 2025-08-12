import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        // Country(Key), polulation(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("USA", 90);
        map.put("China", 150);

        //System.out.println(map);

        map.put("India", 180);
        System.out.println(map);

        // Search 
        if (map.containsKey("China")) {
            System.err.println("Key is Present");
        } else {
            System.out.println("Not present");
        }

        // Get Value
        System.out.println(map.get("China")); //Key Exits
        System.out.println(map.get("Russia")); // Key Not Exits 
    }
}
