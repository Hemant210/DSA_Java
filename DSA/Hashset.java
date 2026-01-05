package DSA;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    public static void main(String[] args) {
        //Creating Hashset
        HashSet<Integer> set = new HashSet<>();

        //Insert Element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//Not Insert Duplicate
        set.add(4);
        
        //Search-contains element
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does Not contains");
        }

        //Delete element 
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Set does Not contains we deleted 1");
        }

        //Print set size
        System.out.println("Size of set is :- " + set.size());

        //Print all Elemment
        System.out.println(set);

        //Iterator in Hashset
        Iterator IT = set.iterator();
        //HasNext,Next
        while (IT.hasNext()) {
            System.out.println(IT.next());
        }
        
    }
}
